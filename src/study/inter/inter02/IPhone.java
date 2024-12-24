package study.inter.inter02;

public class IPhone implements Callable{
	
	int callStatus; //전화상태 나타내는 변수
	
	public void callON() {
		System.out.println("아이폰 전화 ON");
		callStatus = Callable.CALL_ON;
	}
	
	public void callOff() {
		System.out.println("아이폰 전화 Off");
		callStatus = Callable.CALL_OFF;
	}

}
