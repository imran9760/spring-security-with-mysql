package com.wipro.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.model.Student;
import com.wipro.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudent(){
		List<com.wipro.entity.Student> studentList = studentRepository.findAll();
		List<Student> list = new ArrayList<>();
		for(com.wipro.entity.Student s : studentList) {
			Student stu = new Student();
			stu.setId(s.getId());
			stu.setName(s.getName());
			stu.setEmail(s.getEmail());
			list.add(stu);
		}
		return list;
	}

}
