package study.practice.quiz17;

//public class CountThread extends Thread{
//	
//	Number number;
//	
//	public CountThread(Number number) {
//		this.number = number;
//	}
//
//	public void run() {
//		
//		for(int i=1; i<=50; i++) {
//			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			synchronized (number) {
//				System.out.println("Odd: " + number.addOdd() + ", Even: " + number.addEven());
//			}
//		}
//	}
//}

public class CountThread implements Runnable {

	
	public void run() {
	
		
		for (int i=1; i<=100; i++) {
			
			if(i % 2 == 0) {
				System.out.println("even : " + i);
			} else {
				System.out.println("odd : " + i);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}