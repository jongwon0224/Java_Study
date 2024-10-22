package study.reference;

import java.util.Scanner;

public class refer01 {

	public static void main(String[] args) {
		//참조
		/*
		// 변수 선언만 하면 null, 초기화는 값있는거임
		int num = 0; //값 0이 들어있음
		System.out.println(num); //출력됨

		int n; //null
		System.out.println(n); //출력안됨 -> 값없음
		
		
		String s1; //null
		System.out.println(s1); //출력안됨

		String s2 = null; //null이라는 값이 들어있음
		System.out.println(s2); //출력됨
		*/
		
		//System.out.println(get);
	

		Scanner scanner = new Scanner(System.in);
		
//		==은 주소 비교 / .equals()는 문자열 비교
//		string변수 비교시 .equals()가 좋음
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		String str4 = new String("아침");
		
		
		System.out.println(str1 == str2); //true => 같은 주소 같은 값
		System.out.println(str1.equals(str2)); //true => 같은 주소 같은 값
	
		
		System.out.println(str3 == str2); //false => 다른 주소가 같은 값
		System.out.println(str3.equals(str2)); //true => 다른 주소 담겨있는 값은 동일
	
	
		System.out.println(str1 == str4); //false => 다른 주소가 같은 값
		System.out.println(str1.equals(str4)); //true => 다른 주소 담겨있는 값은 동일
		
		
//		String test = null;
//		System.out.println(test.equals("널이냐"));
		//NullPointerException
		
		
		int n1 = 10;
		int n2 = n1; //n2 = 10
		System.out.println(n2);
		
		String ss1 = "점심"; // 주소  생성후 값 입력
		String ss2 = ss1; // ss1주소만 복사함 => 주소복사 = 같은주소 같은값 복사
		System.out.println(ss2);
		
		
	}
	
	
	

}
