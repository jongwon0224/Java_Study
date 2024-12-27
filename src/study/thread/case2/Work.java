package study.thread.case2;

public class Work implements Runnable {
	
	int workCount;
	int workLoad;
	
	
	public Work(int workLoad) {
		this.workLoad = workLoad;
		workCount = 0;
	}
	
	// 싱크방법1
//	public synchronized void addCount() {
	public void addCount() {
		workCount++;
	}
	
	@Override
	public void run() {
		
		while(workCount < workLoad) {
			// 싱크방법2
			synchronized (this) {				
				addCount();
				System.out.println(Thread.currentThread().getName() + "workCount : " + workCount);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			
		}
		
	}
	
}
