package com.edu.studentApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.studentApi.model.StudentEntity;
import com.edu.studentApi.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public Iterable<StudentEntity> getAllStudents(){
		return studentRepository.findAll();
		
		
	}
	
	public List<StudentEntity> findByFirstName(String firstName){
		
		return studentRepository.findByFirstName(firstName);
	}
}
