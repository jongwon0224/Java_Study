package study.db.sample.v2;

public class ProductDTO {
	
	int pCode, pPrice;
	String pName;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(int pCode, int pPrice, String pName) {
		super();
		this.pCode = pCode;
		this.pPrice = pPrice;
		this.pName = pName;
	}
	
	
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String toString() {
		return "Product [pCode =" + pCode + ", pName = "+pName+", pPrice="+pPrice+ "]";
	}
	
}
