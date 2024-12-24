package study.inter.inter02;

public interface Connectable { //무선 블루투스 연결
	
	int CONNECT_ON = 1;
	int CONNECT_OFF = 2;
	
	public void connect(); //연결한다 (메소드)
}
