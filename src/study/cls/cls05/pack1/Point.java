package study.cls.cls05.pack1;

public class Point {

	// getter, setter 설명
	// get OOO
	// set OOO
	int math, eng; // 점수관리 : 0 ~ 100점까지
	private int com; 
	
	// pulic이 관례 + setOOO메소드명
	// setter는 변수를 받아서 필드값에 저장
	public void setMath(int math) {
		this.math = math;
	}
	
	// getter는 바로 출력
	public int getMath() {
		return this.math;
	}
	
	// setter사용시 변수에 private설정 후 조건 넣을수있음
	public void setCom(int com) {
		if(com > 100) {
			this.com = 100;
		} else if(com < 0) {
			this.com = 0;
		} else {
			this.com = com;
		}
	}
	
	public int getCom() {
		return this.com;
	}
	
}