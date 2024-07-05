package com.seleniumexpress.sm.DAO;

import java.util.List;

import com.seleniumexpress.sm.api.Student;

public interface StudentDAO {

	List<Student>loadStudents();
	void saveStudent(Student student);
	
	// DAO helper method 
	Student getStudent(int id);
	
	void update(Student student);
	void deleteStudent(int id);
}
