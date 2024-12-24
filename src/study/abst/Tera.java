package study.abst;

public class Tera extends Beverage {

	double alcol; //알콜도수 5.5도

	@Override // beverage 클래스 abstract메소드 재정의
	public void checkSafety() {
		System.out.println("알콜 안전 ?");
	}
	
}
