package study.db.sample.quiz05;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class StudentDTO {

	int studno, grade, height, weight, deptno1, deptno2, profno;
	String name, id, jumin, tel;
	Date birthday;
	
	
	public StudentDTO() {
		
	}
	
	public StudentDTO(int studno, int grade, int height, int weight, int deptno1, int deptno2, int profno, String name,
			String id, String jumin, String tel, Date birthday) {
		super();
		this.studno = studno;
		this.grade = grade;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.jumin = jumin;
		this.tel = tel;
		this.birthday = birthday;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDeptno1() {
		return deptno1;
	}

	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}

	public int getDeptno2() {
		return deptno2;
	}

	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
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

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

	@Override
	public String toString() {
		String str = new SimpleDateFormat("yyyy-MM-dd").format(birthday);
        
		return "StudentDTO [studno=" + studno + ", grade=" + grade + ", height=" + height + ", weight=" + weight
				+ ", deptno1=" + deptno1 + ", deptno2=" + deptno2 + ", profno=" + profno + ", name=" + name + ", id="
				+ id + ", jumin=" + jumin + ", tel=" + tel + ", birthday=" + str +"]";
	}
	
	
	
	
	
}
