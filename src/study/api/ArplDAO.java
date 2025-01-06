package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.sample.v2.DBConnectionManager;


public class ArplDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	//insert update delete db상 -> 실행 후 적용된 행의 갯수
	public int saveArplInfo(ArplInfo arplInfo) { // 위처럼 나눠서 매개변수보다 객체단위로 저장하는게 좋음
		
		conn = DBConnectionManager.connectDB();
		int result = 0;
		
		// 1번 매개변수 = pk값이여서 쿼리문 그대로 인자로 넣음
		// 1.NVL쿼리문 사용
		// 2.시퀀스 사용
//		String sqlQuery = "insert into ARPLINFO values ( (select NVL(Max(Arplno), 0)+1 "+" from ArplInfo), ?, ?, ?, ?, ?, ?)";
		String sqlQuery = "insert into ARPLINFO values (arplinfo_pk_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅(첫번째 매개변수는 쿼리문, 나머지 6개 설정)
			psmt.setString(1, arplInfo.getInformCode());
			psmt.setString(2, arplInfo.getActionKnack());
			psmt.setString(3, arplInfo.getInformCause());
			psmt.setString(4, arplInfo.getInformData());
			psmt.setString(5, arplInfo.getInformGrade());
			psmt.setString(6, arplInfo.getImageUrl1());
			
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
	public int removeArplInfo(int ArplNo) {
		
		conn = DBConnectionManager.connectDB();
		int result = 0;
		
		String sqlQuery = "delete from ARPLINFO where ArplNo = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			//파라미터 세팅
			psmt.setInt(1, ArplNo);
			
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
}
