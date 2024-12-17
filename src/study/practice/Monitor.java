package study.practice;

public class Monitor {

	//필드
	String company; // 회사
	int inch; // 인치
	int price; // 가격
	String color; // 색상
	int maxX; // 최대해상도X
	int maxY; // 최대해상도Y
	
	
	
	// 생성자
	public Monitor () {
		
	}
	
	public Monitor (String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	// 색상 setter
	public void setColor (String color) {
		this.color = color;	
	}

	// 해상도 setter
	public void setMaxXY (int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	// 전원켜기
	public void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	
	// 가격 인상
	public int priceRise(int num) {
		this.price = this.price + num;
		return this.price;
	}
	
	// 자신의 정보 출력
	public void printInfo() {
		System.out.printf("회사:%s / %d인치 / 가격:%d원 / 색상:%s / 해상도:%d * %d", company, inch, price, color, maxX, maxY);
		System.out.println();
	}
	
	
	
	
	
}
