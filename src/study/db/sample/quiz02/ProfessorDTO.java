package study.db.sample.quiz02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.sample.quiz.ProductDTO;

public class ProfessorDTO {
	
	// 필드
	int profno, pay, deptno;
	String name, id, position;
	
	// 생성자
	public ProfessorDTO() {
		
	}
	
	public ProfessorDTO(int profno, int pay, int deptno, String name, String id, String position) {
		this.profno = profno;
		this.pay = pay;
		this.deptno = deptno;
		this.name = name;
		this.id = id;
		this.position = position;
	}
	
	// getter & setter
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}	
	
	
}
