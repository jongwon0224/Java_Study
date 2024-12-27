package study.thread.case1;

public class Worker extends Thread {

	String name;
	int workLoad;
	Work work;
	
	public Worker(String name, int workLoad, Work work) {
		this.name = name;
		this.workLoad = workLoad;
		this.work = work;
	}
	
	// 쓰레드 실행하기 위해서 run메소드 만들어야됨
	public void run() {
		
		for(int i=1; i<=workLoad; i++) {
			// 0.1초 후에 코드실행 그리고 다시 0.1초 ~~
			try {
				// 0.1초 지연 -> thread.sleep(100)
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// 동기화하기 2번 -> synchronized() {}만들어서 블록으로 감싸기
			// 메소드에 synchronized사용 x
			// 매개변수 -> 공유객체 기준으로 쓰레드 동기화 처리 (work객체기준)
			synchronized (work) {
				work.addCount();			
				System.out.println(name + " : " + work.workCount);
			}
		}
	}
}
