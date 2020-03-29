package com.antonprio.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.antonprio.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
