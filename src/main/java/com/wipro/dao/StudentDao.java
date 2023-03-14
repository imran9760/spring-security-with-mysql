package com.wipro.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.config.DBConfiguration;
import com.wipro.model.Student;
import com.wipro.repository.StudentRepository;


public class StudentDao {
	
	public List<Student> getStudent(){
		List<Student> list = new ArrayList<>();
		SessionFactory sessionFactory = DBConfiguration.getSessionFactory();
		Session session = sessionFactory.openSession();
		com.wipro.entity.Student student = new com.wipro.entity.Student();
		session.load(student,1);
		System.out.println(student);
		Student stu = new Student();
		stu.setId(student.getId());
		stu.setEmail(student.getEmail());
		stu.setName(student.getName());
		list.add(stu);
		return list;
	}

}
