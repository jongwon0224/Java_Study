package study.db.sample;

			// DTO 객체 (Data Transfer Object
public class Dept { // DeptDTO

	// 필드명
	// db테이블명하고 이름 맞춰줘야됨
	int deptno;
	String dname;
	String loc;
	
	// 생성자
	public Dept() {
	}
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// getter & setter 메소드
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public int getDeptno() {
		return deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public String getLoc() {
		return loc;
	}
}
