package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.StudentDao;
import com.wipro.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public List<Student> getStudent(){
		return studentDao.getStudent();
	}

}
