package com.seleniumexpress.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.service.StudentService;





@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		// call the service to get the data...
	
		List<Student> studentList = studentService.loadStudents();
		
		
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
	
		Student student = new Student();
		
		model.addAttribute("student",student);
		 
		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudent(Student student) {
	
		// write the logic to save the data to the database
		
		System.out.println(student);
		// 1. do a condition check
		// 2.if the user doesn`t have an id then do a insert
		// 3.if the user does have a id ----> do a update

		if (student.getId() == 0) {
			// insert new record
			studentService.saveStudent(student);
		}
		else {
			//do an update 
			studentService.update(student);
		}
		
		// do a service call to save the students
	
		//studentService.saveStudent(student);
		
		return "redirect:/showStudent";
	}
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId")int id,Model model) {
	
		System.out.println("Looking data for the student having id :" + id);
		
		Student theStudent = studentService.getStudent(id);
		System.out.println(theStudent);
		// setting the student information 
		model.addAttribute("student", theStudent);
		
		return "add-student";
	}
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId")int id) {
	
		// capture the id of the student whom you are trying to delete
		//once
		studentService.deleteStudent(id);
		
		return "redirect:/showStudent";
	}

}
