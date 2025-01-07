package study.db.sample.test;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.sample.v2.DBConnectionManager;

public class ApisDAO {
		
		Connection conn;
		PreparedStatement psmt;
		ResultSet rs;
		
		public int saveApisInfo(ApisInfo apisInfo) {
			
			conn = DBConnectionManager.connectDB();
			int result = 0;
			
			String sqlQuery = "insert into APISLINFO values (apisInfo_pk_seq.nextval, ?, ?, ?, ?, ?)";
			
			try {
				psmt = conn.prepareStatement(sqlQuery);
				
				psmt.setString(1, apisInfo.getResultCode());
				psmt.setString(2, apisInfo.getResultMsg());
				psmt.setString(3, apisInfo.getFcstDate());
				psmt.setString(4, apisInfo.getFcstTime());
				psmt.setString(5, apisInfo.getFcstValue());
				
				result = psmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {			
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}
			return result;
		}
		
		
		
		public int removeApisInfo(int ApisNo) {
			
			conn = DBConnectionManager.connectDB();
			int result = 0;
			
			String sqlQuery = "delete from APISINFO where ApisNo = ?";
			
			try {
				psmt = conn.prepareStatement(sqlQuery);
				
				psmt.setInt(1, ApisNo);
				
				result = psmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {			
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}
			return result;
		}	
	

}
