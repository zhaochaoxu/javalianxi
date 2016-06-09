package shujukuDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import student.entity.Student;
import studentdao.StudentDao.Mybulid;

import java.sql.PreparedStatement;

public class DBhelp<T> {
	Connection conn = null;
	PreparedStatement stat = null;
	ResultSet rs = null;
	String url;

	public DBhelp(String url) {
		this.url = url;
	}

	public void getStat(String sql) {
		try {
			conn = DriverManager.getConnection(url);
			stat = conn.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}
	}

	public int doUpdate(String sql, Object... par) {
		getStat(sql);
		try {
			for (int i = 1; i <= par.length; i++) {
				stat.setObject(i, par[i - 1]);
			}
			return stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println("��ɾ����������");
			e.printStackTrace();
			return 0;
		} finally {
			close();
		}
	}

	public T QueryOne(String sql, RowMap<T> rw, Object... par) {  
		//  RowMap<T> rw = new Mybulid()
		
		getStat(sql);
		try {
			for (int i = 0; i < par.length; i++) {
				stat.setObject(i + 1, par[i]);
			}
			rs = stat.executeQuery();
			if (rs.next()) {
				T st = rw.build(rs);//T 
				return st;
				//return rw.build(rs);		
			}
			else{
				return null;	
			}
				
		} catch (SQLException e) {
			System.out.println("��ѯ��������");
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}

	public List<T> QueryAll(String sql, RowMap<T> rw, Object... par) {
		getStat(sql);
		try {
			for (int i = 0; i < par.length; i++) {
				stat.setObject(i + 1, par[i]);
			}
			rs = stat.executeQuery();
			List<T> list = new ArrayList<>();
			while (rs != null && rs.next()) {
				list.add(rw.build(rs));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("��ѯ��������");
			e.printStackTrace();
			return null;
		} finally {
			close();
		}

	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stat != null) {
					stat.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
