package study.thread;

public class Thread01 extends Thread{
	
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			// 위에 코드 실행하고 1초 쉬고 다시하고 5초 쉬고 이런느낌
			// thrad.sleep실행할때 예외처리 필수
			try {				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
