package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
//	to call same method in Dao..
	StudentDao studentDao=new StudentDao();
//	private Object id;
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	}

