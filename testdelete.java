package com.school.controler;

import com.school.service.StudentService;

public class TestDelete4 {
public static void main(String [] args) {
	StudentService student=new StudentService();
	boolean res=student.deleteStudentById(1);
	System.out.println(res);
}
}
