package study.inter.inter02;

public interface Callable {

	int CALL_ON = 1; //전화중인 상태
	int CALL_OFF = 2; // //전화 끊은 상태 : public static final int CALL_OFF = 2; 
	
	//public void callOn(); //인터페이스에서 메소드 선언만
	public void callOff();
	public void callON();
}
