package com.edu.studentApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edu.studentApi.model.Address;
import com.edu.studentApi.model.Student;
import com.edu.studentApi.model.StudentEntity;
import com.edu.studentApi.model.StudentResponse;
import com.edu.studentApi.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentSerivce;
	@GetMapping(value="/students")
	public StudentResponse getStudents(){
		StudentResponse studentResponse = new StudentResponse();
		Iterable<StudentEntity> studentEntity = studentSerivce.getAllStudents();
		List<Student> studentList = new ArrayList<>();
		for(StudentEntity studentEnt: studentEntity) {
			Student student = new Student();
			student.setAge(studentEnt.getAge());
			student.setId(studentEnt.getId());
			student.setFirstName(studentEnt.getFirstName());
			student.setLastName(studentEnt.getLastName());
			student.setPhone(studentEnt.getPhone());
			student.setEmail(studentEnt.getEmail());
			
			
			Address address = new Address();
			List<Address> addressList = new ArrayList<>();
			address.setZipcode(studentEnt.getZipcode());
			address.setCity(studentEnt.getCity());
			address.setCountry(studentEnt.getCountry());
			addressList.add(address);
			student.setAddress(addressList);
			
			studentList.add(student);
		}
		studentResponse.setStudentResponse(studentList);
		return studentResponse;
	}	
	
	@GetMapping(value="/students/{firstName}")
	public List<StudentEntity>  getStudentByFirstName(@PathVariable("firstName") String firstName) {
		
		List<StudentEntity> response = studentSerivce.findByFirstName(firstName);
				return response;
	}
	@GetMapping(value="/hello")
	public String hello() {
		return "Hello API";
	}
}
