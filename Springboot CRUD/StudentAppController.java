package com.example.studentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.studentapp.Entity.Student;


@Controller
public class StudentAppController 
{
	@PostMapping("/api/add")
	public Student addStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		return student;
	}
	
}
