package study.thread;

public class Thread02 implements Runnable {
	
	@Override
	public void run() {
		for(int i=11; i<20; i++) {
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
