package subject.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shujukuDao.DBhelp;
import studentdao.DU;
import subject.entity.Subject;

public class SubjectDao {
	DBhelp db = new DBhelp(DU.url);
	
	public int Adsubject(Subject su){
		String sql = "insert into subject(name,classhour,majorid) values(?,?,?)";
		return db.doUpdate(sql, su.getName(),su.getClasshour(),su.getMajorid());
	}
	
	public int UpdateSunject(Subject su){
		String sql="update sbject set name=?,classhour=?,majorid=? where name=?";
		return db.doUpdate(sql,su.getName(),su.getClasshour(),su.getMajorid() );
	}
	public int RemoveSunject(String name){
		String sql="delete from subject where name=?";
		return db.doUpdate(sql, name);
	}
	
	/*public Subject QuerySubject(int majorid){
		String sql="select name,classhour,majorid from subject where majorid=?";
		ResultSet rs=db.doQuery(sql, majorid);
		try {
			if(rs!=null&rs.next()){
				Subject su= new Subject();
				su.setName(rs.getString("name"));
				su.setClasshour(rs.getInt("classhour"));
				su.setMajorid(rs.getInt("majorid"));
				return su;
			}else{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			db.close();
		}
	}

	public List<Subject> showAll(){
		
		String sql="select name,classhour,majorid from subject";
		List<Subject> list= new ArrayList<>();
		ResultSet rs = db.doQuery(sql);
		try {
			while(rs!=null&rs.next()){
				Subject su= new Subject();
				su.setName(rs.getString("name"));
				su.setClasshour(rs.getInt("classhour"));
				su.setMajorid(rs.getInt("majorid"));
				list.add(su);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			db.close();
		}
		return list;
	}*/
	
}
