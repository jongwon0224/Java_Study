package study.db.sample.v2.profQuiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {

		
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		List<ProfessorDTO> pList = professorDAO.findProfessorListByDeptno(101);
		
		ProfessorDTO p = pList.get(0);
		System.out.println(p.getHiredate());
		
//		System.out.println(ConvertDateUtil.convertLocalDateTimeToString(p.getHiredate()));
		
//		System.out.println(p.getHiredate().getMonthValue());
//		System.out.println(p.getHiredate().getYear());
		//1980-06-23
		
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void findProduct() {


		Connection conn = null; // db 연결
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//쿼리 준비
		String sqlQuery = "select * from product";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);	
		}
	}

	//		       readDept   findDept    findDeptList
	public static void selectDept() {
		
		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();
	
		//쿼리 준비
		String sqlQuery = "select * from dept";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				//				System.out.println(rs.getInt(1));
				//				System.out.println(rs.getString(2));
				//				System.out.println(rs.getString(3));


				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);	
		}
	}
	
	
	public static void selectDept2() {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String sqlQuery = "select * from dept where deptno = 30";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			if(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);	
		}
		
	}
	
	
	public static void findDeptByDname(String dname) {
		

		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비  
		String sqlQuery = "select * from dept where dname = ? ";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery();

			if(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);	
		}
	}
	
	
	
	

}