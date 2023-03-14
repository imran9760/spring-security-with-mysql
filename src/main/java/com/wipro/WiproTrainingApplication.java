package com.wipro;


import java.util.List;
import com.wipro.model.Student;
import com.wipro.service.*;
import com.wipro.service.impl.StudentServiceImpl;

public class WiproTrainingApplication {

	public static void main(String[] args) {	
		StudentService studentService = new StudentServiceImpl();
		List<Student> list = studentService.getStudent();
		for(Student s: list) {
			System.out.println("Student:[ "+s.getId() +" | "+s.getName()+" | "+s.getEmail()+" ]");
		}
	}

}
