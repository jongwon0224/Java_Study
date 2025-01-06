package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	Connection conn; 
	PreparedStatement psmt;
	ResultSet rs;
	
	
	
	
	
	
	//db상으로는 select문 (조회)
	public List<ProductDTO> findProductList() {
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = "select * from product";
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				productList.add(new ProductDTO(rs.getInt("p_code"), rs.getInt("p_price"), rs.getString("p_name")));
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return productList;
	}
}
