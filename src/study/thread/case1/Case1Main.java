package study.thread.case1;

public class Case1Main {

	public static void main(String[] args) {
		
		Work work = new Work();
		
		Worker w1 = new Worker("A", 30, work);
		Worker w2 = new Worker("B", 30, work);
		
		// 쓰레드 실행하려면 run메소드 만든후 start로 실행
		w1.start();
		w2.start();
	}

}
