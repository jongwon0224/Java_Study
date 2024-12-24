package study.inter.inter02;

public class GalaxyPhone implements Callable, Connectable{

	int callStatus; //전화상태 나타내는 변수
	int connectStatus;
	
	
	public void callON() {
		System.out.println("갤럭시 전화 ON");
		callStatus = Callable.CALL_ON;
	}
	
	public void callOff() {
		System.out.println("갤럭시 전화 Off");
		callStatus = Callable.CALL_OFF;
	}
	
	// 블루투스 인터페이스 매소드
	public void connect() {
		System.out.println("갤럭시 블루투스 연결");
		connectStatus = Connectable.CONNECT_ON;
	}

}
