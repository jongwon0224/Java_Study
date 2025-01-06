package study.db.sample.quiz02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.quiz.ProductDTO;

public class ProfessorMain {

	public static void main(String[] args) {
		

		List<ProfessorDTO>pList = findProfessorbyDeptno(101);
		
		if(pList.size() > 0) {
			for(ProfessorDTO p1 : pList) {
				System.out.println(p1.getProfno()+" "+p1.getPay()+" "+p1.getDeptno()+" "+p1.getName()+" "+p1.getId()+" "+p1.getPosition());
			}
		}

		
	}
	
public static List <ProfessorDTO> findProfessorbyDeptno(int deptno) {
		
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
		
		List<ProfessorDTO> profList = new ArrayList<ProfessorDTO>();
		String sqlQuery = "select * from professor where deptno = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProfessorDTO prof = new ProfessorDTO(rs.getInt("profno"), rs.getInt("pay"), rs.getInt("deptno"), rs.getString("name"), rs.getString("id"), rs.getString("position"));
				profList.add(prof);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {		
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
		return profList;
	}

}
