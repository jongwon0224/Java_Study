package study.practice;

public class MonitorMain {

	public static void main(String[] args) {

		
		
		// 객체 생성
		Monitor m1 = new Monitor("삼성",27,150000);
		Monitor m2 = new Monitor("LG",32,330000);
		
		/*
		Monitor m3 = new Monitor();
		Monitor m4 = new Monitor();

		Monitor [] arr = {m3, m4};

		
		for(int i=0; i<arr.length; i++) {
			arr[i] = m1;
			arr[i].printInfo();
		}
		*/
		
		// m1 색상, 해상도 설정
		m1.setColor("검은색");
		m1.setMaxXY(1080, 780);
		
		// m2색상, 해상도 설정
		m2.setColor("흰색");
		m2.setMaxXY(4096, 2048);
		
		// 해당모니터 정보 출력
		m1.printInfo();
		m2.printInfo();
		
		// 2번 모니터 가격인상
		m2.priceRise(70000);
		
		// 최종 결과 출력
		m1.printInfo();
		m2.printInfo();
	}
}
