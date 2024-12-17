package study.cls.cls05.pack1;

public class PointMain {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		p1.math = 90;
		p1.eng = 80;
//		p1.com = 100;

		// setter 인자 50을 받아서 클래스 변수값에 저장
//		p1.setMath(50);
//		System.out.println(p1.math); //50
		
		// getter는 바로 저장
//		System.out.println(p1.getMath()); //90
	
		//setter로 설정 및 조건걸기
		p1.setCom(101);
		//getter로 출력
		System.out.println(p1.getCom());
		
	}
	


}
