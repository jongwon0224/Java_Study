package study.db.sample.v2;

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
		// 1.deptDAO클래스 객체화
		DeptDAO deptDAO = new DeptDAO();
		List <Dept> saveList = new ArrayList<Dept>();
		saveList.add(new Dept(81, "이름1", "지역1"));
		saveList.add(new Dept(82, "이름2", "지역2"));
		saveList.add(new Dept(83, "이름3", "지역3"));

		int count = 0;
		for(Dept d : saveList) {
			int result = deptDAO.saveDept(d);
			count += result;
			if(result > 0) System.out.println("저장잘됨");
		}
		System.out.println("총 " + count + "개 저장됨");
		
		
		Dept changeDept = new Dept(83, "재무팀", "부산");
		changeDept.setLoc("울산");		
		
		int r3 = deptDAO.modifyDept(changeDept);
		if(r3>0) {
			System.out.println("수정 잘됐다");
		}
		
		//데이터 저장하기
//		Dept newD = new Dept();
//		newD.setDeptno(90);
//		newD.setDname("개발팀");
//		newD.setLoc("서울");
//				
//		int result = deptDAO.saveDept(newD);
//		if(result > 0) System.out.println("데이터 저장 성공");
		
		/*
		// 1.pk로 삭제하기
		DeptDAO deptDAO = new DeptDAO();
		int r1 = deptDAO.removeDept(83);
		
		if(r1 > 0) System.out.println("삭제 잘됨");
		
		// 2.객체로 삭제하기
		Dept dd = new Dept(90, null, null);
		int r2 = deptDAO.removeDept(dd);
		
		if(r2>0) System.out.println("삭제 잘됨");
		*/

		
		//2-1. deptDAO객체를 생성해서 출력
		Dept d1 = deptDAO.findDeptbyDeptno(30);
		
		if(d1 != null) {
			System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());			
		}
		
		
		//2-2. deptDAO객체를 리스트화
		List<Dept> dList = deptDAO.findDeptList();
		
		if(dList != null && dList.size() > 0) {
			for(Dept d : dList) {
				System.out.println(d.getDeptno() + " " +d.getDname() + " " + d.getLoc());
			}
		}
		
		//3. productDAO 객체생성
		ProductDAO productDAO = new ProductDAO();
		//3-1. productDTO객체화 후 리스트 만들기
		List<ProductDTO> productList = productDAO.findProductList();
		
		for(ProductDTO p : productList) {
			System.out.println(p.toString());
		}
	}	
//=========================================================================================
	// readDept or FindDept로 메소드이름 많이씀
	public static void findDept() {		
		// connection도 예외처리 필수
		Connection conn = null; // db연결
//				Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB();		
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
		} finally {
			// DB연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);			
		}
	}
//=========================================================================================
	// readDept or FindDept로 메소드이름 많이씀
		public static void findDept2() {
					// connection도 예외처리 필수
			Connection conn = null; // db연결
//					Statement stmt = null; // 연결하여 sql명령을 실행해주는 객체 (javaSql로 import해야됨)
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			conn = DBConnectionManager.connectDB();	
			
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
			} finally {
				// DB연결 종료
				DBConnectionManager.disconnectDB(conn, psmt, rs);				
			}
		}
		
//=========================================================================================
		public static void findDeptbyDname(String dname) {
			
			
			// connection도 예외처리 필수
			Connection conn = null; // db연결
			PreparedStatement psmt = null;
			ResultSet rs = null; // sql실행 select 결과를 저장하는 객체
			
			conn = DBConnectionManager.connectDB();	
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
			} finally {
				// DB연결 종료
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}			
		}		
}
