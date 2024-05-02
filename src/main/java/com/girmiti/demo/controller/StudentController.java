package com.girmiti.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.girmiti.demo.entity.StudentEntity;
import com.girmiti.demo.repositary.StudentRepositary;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepositary repo;
	
	@GetMapping("/students")
	public List<StudentEntity> getData()
	{
		List<StudentEntity> students = repo.findAll();
		return students;
	}
	
	@GetMapping("/students/{id}")
	public StudentEntity getStudent(@PathVariable int id)
	{
		return repo.findById(id).get();
	}
	
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody StudentEntity student) 
	{
		repo.save(student);
	}
	
	@PutMapping("/student/update/{id}")
	public StudentEntity updateStudent(@PathVariable int id)
	{
		StudentEntity se  = repo.findById(id).get();
		se.setsName("Smith");
		se.setsPhno(7494956778l);
		repo.save(se);
		return se;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id)
	{
		repo.delete(repo.findById(id).get());
	}
}
