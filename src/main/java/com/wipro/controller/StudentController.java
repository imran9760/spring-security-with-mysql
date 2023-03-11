package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dao.StudentDao;
import com.wipro.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDao studentDao;
	
	@RequestMapping("/student")
	public List<Student> getStudent(){
		return studentDao.getStudent();
	}

}
