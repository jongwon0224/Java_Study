package study.db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {
		
//		findDept();
//		findDept2();
//		findProduct();
//		findDeptbyDeptno(40);
//		findDeptbyDname("RESEARCH");
//		findDeptbyDname("OPERATIONS");
		
		//1. DTO객체를 생성해서 출력
		Dept d1 = findDeptbyDeptno(10);
		
		if(d1 != null) {
			System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());			
		}
		
		//2. DTO객체를 리스트화
		List<Dept> dList = findDeptList();
		
		if(dList != null && dList.size() > 0) {
			for(Dept d : dList) {
				System.out.println(d.getDeptno() + " " +d.getDname() + " " + d.getLoc());
			}
		}
		
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
	
//=========================================================================================
	// readDept or FindDept로 메소드이름 많이씀
	public static void findDept() {
		
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
//		String sqlQuery = "select * from deptno = 30";
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
//=========================================================================================
	// readDept or FindDept로 메소드이름 많이씀
		public static void findDept2() {
			
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
//					Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			
			// db연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			// 쿼리 준비
			
			String sqlQuery = "select * from dept where deptno = 30";
			try {
				psmt = conn.prepareStatement(sqlQuery);
				rs = psmt.executeQuery();
				
				// pk로 db에서 데이터 가져올때 데이터가 1개이기때문에 while보다 if사용이 좋음
				if(rs.next()) {
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
//=========================================================================================
		// db동적으로 관리하는 방법!
		// DTO객체 받는 메소드
		public static Dept findDeptbyDeptno(int deptno) {
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "scott";
			String db_pw = "tiger";
			
			Connection conn = null; // db연결
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			// db연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			Dept dept = new Dept(); // 객체생성
			String sqlQuery = "select * from dept where deptno = ? "; // 매개변수 받기
			
			try {
				psmt = conn.prepareStatement(sqlQuery);
				psmt.setInt(1, deptno);
				rs = psmt.executeQuery();
				
				if(rs.next()) {					
					// DTO객체에 저장
					dept.setDeptno(rs.getInt("deptno"));
					dept.setDname(rs.getString("dname"));
					dept.setLoc(rs.getString("loc"));
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			} finally { // finally 사용해서 밑에까지 처리함				
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
			return dept;
		}
//=========================================================================================
		public static void findDeptbyDname(String dname) {
			
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
//							Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			
			// db연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			// 쿼리 준비
			String sqlQuery = "select * from dept where dname = ? "; // 매개변수 받기
			
			try {
				psmt = conn.prepareStatement(sqlQuery);
				
				// 매개변수 세팅해줘야됨 -> ~ where deptno = ?
				// 첫번째 물음표에 매개변수 deptno를 세팅해줌, 물음표가 2개면 2번째물음표면 2, deptno이런식
				psmt.setString(1, dname);
				rs = psmt.executeQuery();
				
				// pk로 db에서 데이터 가져올때 데이터가 1개이기때문에 while보다 if사용이 좋음
				if(rs.next()) {
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
//=========================================================================================
		public static List<Dept> findDeptList() {
			
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
//							Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			
			// db연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			List<Dept> deptList = new ArrayList<Dept>();
			
			// 쿼리 준비
			String sqlQuery = "select * from dept"; // 매개변수 받기
			
			try {
				psmt = conn.prepareStatement(sqlQuery);
				rs = psmt.executeQuery();
				
				// pk로 db에서 데이터 가져올때 데이터가 1개이기때문에 while보다 if사용이 좋음
				while(rs.next()) {
					Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
					deptList.add(dept);
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
			
			return deptList;
			
		}
}
