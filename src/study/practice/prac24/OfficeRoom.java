package study.practice.prac24;

public class OfficeRoom extends Room {
	// 필드
	int checkOut_Machine, coffee;
	
	// 생성자
	public OfficeRoom (int checkOut_Machine, int coffee) {
		this.checkOut_Machine = checkOut_Machine;
		this.coffee = coffee;
	}
	// 메서드
	public void doorOpen () {
		isDoorOpen = true;
		System.out.printf("%s강의실 문이 열렸습니다.\n", name);
	}
}
