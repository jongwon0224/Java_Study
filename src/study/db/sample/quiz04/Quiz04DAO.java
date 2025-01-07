package study.db.sample.quiz04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.DBConnectionManager;
import study.db.sample.v2.Dept;

public class Quiz04DAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public List<Dept> findDeptList() {

		conn = DBConnectionManager.connectDB();	
		
		List<Dept> deptList = new ArrayList<Dept>();
		
		// 쿼리 준비
		String sqlQuery = "select * from dept"; // 매개변수 받기
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs); // DB연결 종료		
		}			
		
		return deptList;
	}	
	
	// update하는법
	public int modifyDept(Dept dept) {
		
		conn = DBConnectionManager.connectDB();
		int result = 0;
		
		String sqlQuery = "update dept "
						+ "set dname = ?, loc = ? "
						+ "where deptno = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅
			psmt.setString(1, dept.getDname());
			psmt.setString(2, dept.getLoc());
			psmt.setInt(3, dept.getDeptno());
			
			// select -> executeQuery사용
			// insert, update, delete -> executeUpdate사용
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
	
	//insert update delete db상 -> 실행 후 적용된 행의 갯수
//	public int saveDept(int deptno, String dname, String loc) {
	public int saveDept(Dept dept) { // 위처럼 나눠서 매개변수보다 객체단위로 저장하는게 좋음
		
		conn = DBConnectionManager.connectDB();
		int result = 0;
		
		String sqlQuery = "insert into dept (deptno, dname, loc) values (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());
			
			// select -> executeQuery사용
			// insert, update, delete -> executeUpdate사용
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
	
	// pk기준으로 매개변수 받음 -> 객체 x
	public int removeDept(int deptno) {
		
		conn = DBConnectionManager.connectDB();
		int result = 0;
		
		String sqlQuery = "delete from dept where deptno = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅
			psmt.setInt(1, deptno);
			
			// select -> executeQuery사용
			// insert, update, delete -> executeUpdate사용
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
	
	public int removeDept(Dept dept) {
		int deptno = dept.getDeptno();
		
		return removeDept(deptno);
	}
}
