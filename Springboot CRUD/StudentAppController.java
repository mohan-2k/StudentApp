package com.student.app.studentapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.studentapp.Entity.StudentEntity;
import com.student.app.studentapp.Services.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService ss;
	
	@GetMapping("/getStudents")
	List<StudentEntity> getAllStudents()
	{
		return ss.bringAllStudents();
	}
	
	@GetMapping("/getOne/{id}")
	StudentEntity getOne(@PathVariable("id") int sid)
	{
		return ss.bringOne(sid);
	}
	
	@PutMapping("/insert")
	String insert(@RequestBody StudentEntity s)
	{
		 return ss.save(s);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteOne(@PathVariable("id") int sid)
	{
		return ss.delete(sid);
	}
	
	@PostMapping("/update/{id}")
	String updateOne(@PathVariable("id") int sid,@RequestBody StudentEntity se )
	{
		return ss.update(sid,se);
	}
}
