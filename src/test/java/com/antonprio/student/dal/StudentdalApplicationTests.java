package com.antonprio.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.antonprio.student.dal.entities.Student;
import com.antonprio.student.dal.repos.StudentRepository;

import java.util.Optional;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {		
		Student student = new Student();
		student.setName("King");
		student.setCourse("Jack King Queen");
		student.setFee(100d);
		
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(2l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		Student student = studentOptional.get();
		student.setFee(500d);
		studentRepository.save(student);
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(5L);
		studentRepository.delete(student);
	}


}
