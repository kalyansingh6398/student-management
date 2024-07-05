package com.seleniumexpress.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;


@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	 private StudentDAO studentDAO;
	
	@Override
	public List<Student> loadStudents() {
		
		List<Student> studentList = studentDAO.loadStudents();
		
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		//write the business logic and company criteria 
		if(student.getCountry().equals("India")){
		
			//write the email sending logic right here
			
			System.out.println("mail sent to : " + student.getName());
			
		}
		
		studentDAO.saveStudent(student);
	}

	@Override
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id) ;
	}

	@Override
	public void update(Student student) {
	
	studentDAO.update(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

	

}
