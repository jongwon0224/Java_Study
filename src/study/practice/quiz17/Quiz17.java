package study.practice.quiz17;

public class Quiz17 {
	
//	public static void main(String[] args) {
//		
//		Number n1 = new Number(1,2);
//		CountThread c1 = new CountThread(n1);
//		
//		c1.start();
//	}
	
	public static void main(String[] args) {
		
		
		CountThread c1 = new CountThread();
		Thread thread = new Thread(c1);
		
		thread.start();
		
	}
}
