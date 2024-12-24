package study.abst;

public class Coke extends Beverage{
	
	int sugarGram; //당분 용량

	@Override // beverage 클래스 abstract메소드 재정의
	public void checkSafety() {
		System.out.println("성분 정상 ?");
	}
	
}
