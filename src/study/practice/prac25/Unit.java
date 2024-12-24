package study.practice.prac25;

public class Unit {

	int x,y; // 현재 위치
	String name;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s : %d, %d 만큼 이동 !", name, x,y);
	}
	
	public void stop() {
		System.out.println("정지");
	}
}
