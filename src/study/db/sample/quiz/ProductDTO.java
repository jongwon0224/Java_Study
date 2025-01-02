package study.db.sample.quiz;

public class ProductDTO {

	
	int p_code, p_price;
	String p_name;
	
	
	public ProductDTO() {
	}
	
	public ProductDTO(int p_code, int p_price, String p_name) {
		super();
		this.p_code = p_code;
		this.p_price = p_price;
		this.p_name = p_name;
	}

	
	public int getP_code() {
		return p_code;
	}
	
	public int getP_price() {
		return p_price;
	}
	
	public String getP_name() {
		return p_name;
	}	
	
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	

	
	
}
