package study.db.sample.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz18Main {
	
	public static void main(String[] args) {
		
		ProductDTO p1 = findProductbyPcode(100);
		// null방지 코드 -> null이 아닐경우만 출력
		if(p1 != null) {			
			System.out.println(p1.getP_code() + " " + p1.getP_name() + " " + p1.getP_price());
		}
		
		
		List<ProductDTO> pList = findProductList();
		// null방지 코드 -> null이 아니고 데이터가 1보다 크면 출력
		if(pList.size() > 0) {
			for(ProductDTO p2 : pList) {
				System.out.println(p2.getP_code() + " " + p2.getP_name() + " " + p2.getP_price());
			}
		}
	}
				
	public static ProductDTO findProductbyPcode(int p_code) {
		
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
		
		ProductDTO product = null;	
		String sqlQuery = "select * from product where p_code = ?";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, p_code);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				product = new ProductDTO();
				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));
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
		return product;
	}
	
	
//============================================================================================
	//list로 처리
	public static List<ProductDTO> findProductList() {
		
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
		
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		String sqlQuery = "select * from product";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO product = new ProductDTO(rs.getInt("p_code"), rs.getInt("p_price"), rs.getString("p_name"));
				productList.add(product);			
//				productList.add(new ProductDTO(rs.getInt("p_code"), rs.getInt("p_price"), rs.getString("p_name")));	
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
		return productList;
	}
	
}
