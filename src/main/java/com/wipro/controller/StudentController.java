package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.service.StudentService;
import com.wipro.model.Student;

/*
 * This is StudentController class.
 */
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student")
	public List<Student> getStudent(){
		return studentService.getStudent();
	}

}
