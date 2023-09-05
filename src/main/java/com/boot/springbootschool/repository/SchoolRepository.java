package com.boot.springbootschool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.springbootschool.dto.Student;

public interface SchoolRepository extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);
   List<Student> findByrollno(int rollno);
}
