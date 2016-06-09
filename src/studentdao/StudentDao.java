package studentdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shujukuDao.DBhelp;
import shujukuDao.RowMap;
import student.entity.Student;

public class StudentDao {
	DBhelp<Student> dh= new DBhelp<Student>(DU.url);
	public int Addstudent(Student stu){
		String sql="insert into student(studentno,name,id_card,sex,phone,address,email,majorid) values(?,?,?,?,?,?,?,?)";
		return dh.doUpdate(sql, stu.getStudentno(),stu.getName(),stu.getId_card(),stu.getSex(),stu.getPhone(),
				stu.getAddress(),stu.getEmail(),stu.getMajorid());
	}
	public int Removestudent(Student studentno){
		String sql = "delete from student where studentno=?";
		return dh.doUpdate(sql, studentno);
	}
	public int updatestudent(Student stu){
		String sql="update student set name=?,id_card=?,sex=?,phone=?,address=?,email=?,majorid=? where studentno=?";
		return dh.doUpdate(sql,stu.getName(),stu.getId_card(),stu.getSex(),stu.getPhone(),
				stu.getAddress(),stu.getEmail(),stu.getMajorid(),stu.getStudentno());
	}
	
	public Student Qureystudent(String studentno) {
	   //  RowMap<T> rw = new Mybulid()
		String sql = "select studentno,name,id_card,sex,phone,address,email,majorid from student where studentno=?";
		return dh.QueryOne(sql, new Mybulid(), studentno);
	}
	
	public List<Student> showAll(){
		String sql = "select studentno,name,id_card,sex,phone,address,email,majorid from student";
		return dh.QueryAll(sql, new Mybulid());
		
	}
	
	public class Mybulid implements RowMap<Student>{

		@Override
		public Student build(ResultSet rs) throws SQLException {
			Student stu= new Student();
			stu.setStudentno(rs.getString("studentno"));
			stu.setName(rs.getString("name"));
			stu.setId_card(rs.getString("id_card"));
			stu.setSex(rs.getString("sex"));
			stu.setPhone(rs.getString("phone"));
			stu.setAddress(rs.getString("address"));
			stu.setEmail(rs.getString("email"));
			stu.setMajorid(rs.getInt("majorid"));
			return stu;
		}
		
	}
}
