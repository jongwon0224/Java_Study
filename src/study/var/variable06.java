package study.var;

import java.util.Scanner;

public class variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //10입력시 10\n
			
		System.out.println(num);
		System.out.println( num == 10);//true , false
	
		scanner.nextLine(); //엔터까지 입력을 받아라 -> 남은 \n을 청소용으로 사용		
// 		scanner.next()써도 위랑 같은 효과;
		String str = scanner.nextLine(); //엔터있어서 위에 num에 입력값으로 자동 대입
		
		System.out.println(str);
		System.out.println(str == "밥");//false -> 문자열 비교할때는 ==이 사용 불가
		System.out.println(str.equals("밥"));//true -> (변수)str.equals("비교할 대상")
		System.out.println("밥".equals(str));//true -> 비교대상.equals(str) => a가 b랑 같냐 / b가 a랑 같냐
	}

}
