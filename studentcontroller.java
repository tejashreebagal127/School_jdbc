package com.school.controler;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public StudentController() {
	// TODO Auto-generated constructor stub
}public static void main(String[] args) {
	Student student=new Student();
	student.setId(1);
	student.setName("Teja");
	student.setEmail("teja@mail.com");
	StudentService studentService=new StudentService();
	Student s=studentService.saveStudent(student);
	if(s!=null) {
		System.out.println(s.getId() +" saved succesfully");
	}
	
}
}
