package study.practice.quiz13;

public class Register {

	Status stat;
	
	public Register (Status stat) {
		this.stat = stat;
	}


	public void regi_check() {
		
		if (stat.office == 1) {
			System.out.printf("%d월 %d일 출근중입니다.", stat.month, stat.day);
		} else if (stat.office == 2) {
			System.out.printf("%d월 %d일 휴가중입니다.", stat.month, stat.day);
		} else if (stat.office == 3) {
			System.out.printf("%d월 %d일 병가중입니다.", stat.month, stat.day);
		}
	}
}
