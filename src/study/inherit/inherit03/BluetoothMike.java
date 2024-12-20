package study.inherit.inherit03;

public class BluetoothMike extends Mike {

	
	boolean isConnect;
	
	public void connect() {
	
	}
	
	
	// 새로운 메소드 정의하는 것 -> 메소드 오버라이딩이 아님
	// 2번째 메소드가 부모메소드 오버라이딩
	public int volumeUp (String s) {
		System.out.println("String매개변수 볼륨업");
		return 0;
	}
	
	// 메소드오버라이딩
	public void volumeUp () {
//		super.volumeUp(); // 부모클래스 함수호출
		System.out.println("블루투스 마이크 재정의");
	}
	
	// 메소드 선언 -> 재정의 (오버라이딩)
	public String toString() {
		String s = "나는 블루투스마이크입니다.";
		return s;
	}
	
	
}
