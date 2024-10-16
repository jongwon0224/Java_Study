package study.var;

public class variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type 변환 //
		
		double d1 = 3.14;
		
//		int i2 = d1; 정수형 변수에 실수형 값 대입 못함 ..int는 정수 double은 실수
//		(int)d1 == double을 정수 int로 변환해줌 -> 정수로 변환되어서 소숫점은 절삭
//
		int i2 = (int)d1;
		
		System.out.println(i2);
		//3 소숫점 절삭
		
		float f1 = 4.43f; // float가 double보다 작아서 자동변환 안됨 => 뒤에 f붙여야됨.
		double d3 = f1;	  // float는 double보다 작기때문에 자동변환됨 => (double)f1 안해도됨.
		
		double d4 = 300; // double = 정수형 숫자(int) => double(실수)로 자동변환
		System.out.println(d4); //300.0 출력 => 정수가 실수보다 작아서 자동 실수로 변환(int -> double)

		int a = 10;
		double b = 5.5;
		
//		int result = a + b;  int는 double보다 작아서 int result는 오류나옴.
//		int result = a +(int) b; //b가 실수에서 정수로 변해서 소숫점 사라짐 -> 출력 15나옴
//		result = (int)(a + b); // 15.5출력 -> a+b값 앞에 형변환을 주는 방법 => 윗줄하고 같이써야됨

//		double result = a + b; //result를 정수에서 실수로 변환 -> 15.5 출력
//		System.out.println(result);
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2; // 5 + 6 이 나옴
		System.out.println(rt); // 11
		
		rt = (int)(dv1 + dv2); // 5.5 + 6.6 
		System.out.println(rt); // 12
		
		
		int x = 1; 
		int y = 2;
//		double result = x / y; //정수 1,2를 나눈값은 0.5가 0이 됨.
		double result = (double) x / y; // x나 y앞에 double로 형변환을 줘야됨.
		System.out.println(result); // 0.5
		

	}
	

}
