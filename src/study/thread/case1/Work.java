package study.thread.case1;

public class Work {
	
	int workCount;
	
	public Work() {
		workCount = 0;
	}
	// 동기화하기 1번-> synchronized 사용
//	public synchronized void addCount() {
	public void addCount() {
		workCount++;
	}
}
