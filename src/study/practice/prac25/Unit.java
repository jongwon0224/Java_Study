package study.practice.prac25;

public abstract class Unit { // 추상클래스

	int x,y; // 현재 위치
	String name;
	
	// 추상 메소드화 해야됨
	abstract void move(int x, int y);
	
	public void stop() {
		System.out.println("정지");
	}
}
