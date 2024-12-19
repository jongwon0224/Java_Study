package study.practice.prac19;

public class Computer {

	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	
	int memory; // Main메모리
	int osIndex;
	
	public Computer (int osIndex, int memory) {
		this.osIndex = osIndex;
		this.memory = memory;
	}
	
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d",  Computer.OS_TYPE[osIndex], memory);
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
