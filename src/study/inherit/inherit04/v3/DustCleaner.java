package study.inherit.inherit04.v3;

public class DustCleaner extends Cleaner {

	
	public void doClean() { //메소드 재정의
		System.out.println("먼지털이");
//		super.doClean(); // 부모 메소드 부름
	}
}
