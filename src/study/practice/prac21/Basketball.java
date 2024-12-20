package study.practice.prac21;

public class Basketball extends Sports {

	protected String name;

	public void description() {
		System.out.printf("[%s]는 손으로 공을 던져 골을 넣는 운동이다.\n", name);
	}
}

// 축구
class Soccer extends Sports {
	
	protected String name;
	
	public void description() {
		System.out.printf("[%s]는 주로 발로 공을 차 넣는 운동이다.\n", name);
	}
}

// 탁구
class PingPong extends Sports {
	
	protected String name;
	
	public void description() {
		System.out.printf("[%s]는 공을 번갈아가며 주고 받는 운동이다.\n", name);
	}
}

