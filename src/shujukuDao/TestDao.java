package shujukuDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import student.entity.Student;
import studentdao.StudentDao;

public class TestDao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		StudentDao sd = new StudentDao();
		
		stu = sd.Qureystudent("200802058");
		System.out.println(stu);
		
		/*List<Student> list = new ArrayList<>();
		list = sd.showAll();
        for (Student stu : list) {
        	System.out.println(stu);*/
		}
		
	}
