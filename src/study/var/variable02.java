package study.var;

public class variable02 {

	public static void main(String[] args) {
		// 지역변수 => 자바는 중괄호 {}로 지역 구분.
		// 매소드내에 if문 for문 안에있는 지역변수는 사용 못함. 하지만 if문 for문은 매소드내 변수 사용 가능
		// if문 for문은 서로 변수 돌려쓰기 불가
		
		//int var1; //매소드내 지역변수 , var2, var3사용 불가
		
//		if(~) {
//			int var2;	//var1 사용가능 , var3은 사용불가
//		}
//		
//		for(~) {
//			int var3;	//var1 사용가능 , var2은 사용불가
//		} //

		int num2 = 0b10; //2진수
		int num8 = 012; //8진수
		int num10 = 10; //10진수
		int num16 = 0x30; //16진수
		System.out.println(num16);
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x0123;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴는";
		String submenu = "맘스터치 햄버거";
		System.out.println(menu + " "+ submenu);
		System.out.println(menu+100);
		
//		escape Code
//		String msg = "\"안녕\" 하세요";
//		String msg = "안녕\t하세요"; //탭 (띄어쓰기)
//		String msg = "안녕\n하세요"; //줄바꿈
		
		//실수형은 double로 변수설정하는게 편함 ... 정수형은 int
		double d1 = 12.12;
		double d2 = 0.1212e2;
		
		float f1 = 12.12f;
		
		boolean stop = true;
		boolean go = false;
		
		System.out.println(go);		
		
	}
	
	
	
}
