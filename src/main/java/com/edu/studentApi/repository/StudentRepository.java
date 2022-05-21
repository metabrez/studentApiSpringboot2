package com.edu.studentApi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.studentApi.model.Student;
import com.edu.studentApi.model.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

	List<StudentEntity> findByFirstName(String firstName);
}
