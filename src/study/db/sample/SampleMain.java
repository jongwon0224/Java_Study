package study.db.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleMain {

	public static void main(String[] args) {
		
		FindDept();
		findProduct();	
	}
	
	public static void findProduct() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";		
		
		Connection conn = null; 
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = "select * from product";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// readDept or FindDept로 메소드이름 많이씀
	public static void FindDept() {
		
		//oracle.jdbc.driver 패키지에 있는 OracleDriver클래스들어가기
		// try & catch로 감싸줘야지 실행할수있음
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// DB연결정보 -> url경로 oracle가서 보면 포트번호 있음 *체크*
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		// connection도 예외처리 필수
		Connection conn = null; // db연결
//				Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
		
		
		// db연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 쿼리 준비
		
		String sqlQuery = "select * from dept";
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB연결 종료
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
