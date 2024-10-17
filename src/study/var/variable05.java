package study.var;

import java.util.Scanner; //scanner 패키지 불러옴 -> 해당 데이터 입력 필요

public class variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//println , print는 똑같이 출력 but print는 엔터가 없음
		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);;
		
		System.out.print("출력 3");
		System.out.print("출력 4"); //출력이 가로로됨 (띄어쓰기 x)
		System.out.print(s);
		
		int hour = 10; //숫자는 %d 문자는 %s.. 문장끝에는 마무리로 콤마 + 변수
		int min = 26;
		System.out.println("현재 "+ hour + "시 "+ min + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, min);
		
		//(%10.2f) = %f -> 실수, 10은 10자리수 출력
		double rate = 1.15512;
		System.out.printf("%10.2f %%" ,rate);
		
		System.out.println(); //\n 하고 같음 .. 출력내용은 없어도 줄바꿈으로 사용할수있음;
		

		Scanner scanner = new Scanner(System.in);//scanner클래스 호출시 맨위처럼 패키지 불러야됨
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine();//아무거나 입력 입력시 => scanner.nextline()가 입력으로 바뀜
		System.out.println(input);
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n", input);
		
		
		System.out.println("점수를 입력하세요 : ");
		int point = scanner.nextInt();
//		double point = scanner.nextDouble(); 실수일때는 nextdouble사용
		System.out.println("점수는 " + point + "점 입니다.");
		System.out.printf("점수는 %d점 입니다.\n", point);
		
	}

}
