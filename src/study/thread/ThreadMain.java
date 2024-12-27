package study.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		// 단일스레드 상태 -> 순차적으로 실행됨
//		for (int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i=11; i<20; i++) {
//			System.out.println(i);
//		}
		
		
		Thread01 t1 = new Thread01();
		Thread01 t12 = new Thread01();
		Thread t13 = new Thread01(); // 부모타입에 자식객체 저장
		
		// thread는 start()를 사용해야 실행됨
		t1.start();
		t12.start();
		t13.start();
	
	
		Thread02 t2 = new Thread02();
		Thread t22 = new Thread(t2); //newThread(Runnable task) -> runnable task를 구현할 객체를 매개변수로 넣어라
		t22.start();
		
		Thread t23 = new Thread( new Thread02() );
		t23.start();
		
		System.out.println(t23.getName());
	
	
	}

		
}
