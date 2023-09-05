package com.boot.springbootschool.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.springbootschool.dto.Student;
import com.boot.springbootschool.repository.SchoolRepository;



@RestController
public class StudentController {
	
	@Autowired
	SchoolRepository sr;
	
	@PostMapping("/saveStudent")
	public String saveData(@RequestBody Student student) {
		sr.save(student);
		return "data save sucessfully";
	}

	@GetMapping("/fetchdatabyid")
	public Student fetchbyid(@RequestParam int id) {
		 java.util.Optional<Student> optional = sr.findById(id);
	     Student student  =   optional.get();
		return student;
	}
	
	@PutMapping("/updateData")
	public String updatedata(@RequestBody Student student) {
		sr.save(student);
		return "data updated sucessfully";
		
	}
	
	@DeleteMapping("/deletedatabyid")
	public String deletedata(@RequestParam int id) {
		sr.deleteById(id);
		return "deleted sucessfully";
	}
	
	@GetMapping("/fetchAlldata")
	public List<Student> fetchall(){
	     List<Student> student=	sr.findAll();
	     return student;
	}
	
	@GetMapping("/findbyName")
	public List<Student> findbyname(@RequestParam String name){
	     return sr.findByName(name);
	      	
	}
	
	@GetMapping("/findbyrollno")
	public List<Student> findbyrollno(@RequestParam int rollno ){
		return sr.findByrollno(rollno);
		
	}
	
}
