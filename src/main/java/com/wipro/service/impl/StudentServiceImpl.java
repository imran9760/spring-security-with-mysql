package com.wipro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.StudentDao;
import com.wipro.model.Student;
import com.wipro.service.StudentService;


public class StudentServiceImpl implements StudentService{
	
	//@Autowired
	StudentDao studentDao = new StudentDao();
	
	@Override
	public List<Student> getStudent(){
		return studentDao.getStudent();
	}

}
