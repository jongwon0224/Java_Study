package study.db.sample.quiz05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.DBConnectionManager;


public class StudentDAO {
	
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public List<StudentDTO>findStudent() {
		conn = DBConnectionManager.connectDB();	
		
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		String sqlQuery = "select * from student";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				StudentDTO student = new StudentDTO(rs.getInt("studno"), rs.getInt("grade"), rs.getInt("height"),rs.getInt("weight"),rs.getInt("deptno1"),rs.getInt("deptno2"),rs.getInt("profno"),rs.getString("name"),rs.getString("id"),rs.getString("jumin"),rs.getString("tel"), rs.getDate("birthday"));
				stuList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs); // DB연결 종료		
		}		
		
		return stuList;
	}
	
	
	
	public List<StudentDTO> findStudentbyGrade(int grade) {
		
		conn = DBConnectionManager.connectDB();	
		
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		String sqlQuery = "select * from student where grade = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				StudentDTO student = new StudentDTO(rs.getInt("studno"), rs.getInt("grade"), rs.getInt("height"),rs.getInt("weight"),rs.getInt("deptno1"),rs.getInt("deptno2"),rs.getInt("profno"),rs.getString("name"),rs.getString("id"),rs.getString("jumin"),rs.getString("tel"), rs.getDate("birthday"));
				stuList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs); // DB연결 종료		
		}		
		
		return stuList;
	}
}
