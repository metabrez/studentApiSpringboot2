package com.edu.studentApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.studentApi.model.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

}
