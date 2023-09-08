package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
HelperClass helperClass=new HelperClass();
Connection connection=null;
//to delete a student
public boolean deleteStudentById(int id) {
	connection=helperClass.getConnection();
	String sql="DELETE FROM std WHERE Id=?";
	int i=0;

//establish statement
try {
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, id);
	 i = preparedStatement.executeUpdate();
}catch (SQLException e) {
	// TODO Auto-generated method stub
	e.printStackTrace();
}finally {
	try {
		connection.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
if (i>0){
	return true;
}else {
	return false;
}
}
// to save student data
public Student saveStudent(Student student) {
	connection=helperClass.getConnection();
	String sql="INSERT INTO std VALUES(?,?,?)";
//	?,?,? it is a placeholder...
	try {
//		create statement
		PreparedStatement preparedStatement=connection.prepareCall(sql);
//		passed the values to placeholder
		preparedStatement.setInt(1,student.getId());
		preparedStatement.setString(2,student.getName());
		preparedStatement.setString(3,student.getEmail());
//		execute
		preparedStatement.execute();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
		connection.close();
		} catch (SQLException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	return student;
}
public boolean deleteStudentById(Object id) {
	// TODO Auto-generated method stub
	return false;
}
}
