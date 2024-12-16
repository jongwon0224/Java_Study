package study.oper;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
//		int result1 = scanner.nextInt();
//		int result2 = scanner.nextInt();
//				
//		System.out.println(result1 + result2 < 5);
//		
//		scanner.nextLine();
//		String food = scanner.nextLine();
//		System.out.println(food.equals("밥"));
		
		System.out.println("111111111======================================");
		System.out.println(1+1);
		System.out.println(9-4);
		System.out.println(3*1);
		System.out.println(7/3.0);
		System.out.printf("%.2f\n", 7/3.0); //%f는 실수를 의미 => .2는 2번째 자리수까지 출력
		System.out.println(9%5);
		
		System.out.println("======================================");
		
		//증감연산자 ++ , -- => 변수값 변경시킴
		// ++ x 는 x에 먼저더함, x++는 x에 나중에 더함
		int x = 10;
		System.out.println( ++x ); //x++는 10, ++x는 11, x--는 10, --x는 9
		System.out.println(x); //11 -> x값 변경됨
		
		int z = 30;
		System.out.println(z + 1); // 31 
		System.out.println(z); // 30 -> z값 변경 안됨
		
		int q = 1; //2
		int w = 3; //2
		int e = 10 + ++q; //12 => 10+2
		int r = 3 + w--; //6 => w--는 나중에 => 3 + 3 후에 w값에 -1임
		
		System.out.printf("%d %d %d %d\n", q,w,e,r);

		boolean isFinished = false;
		System.out.println(!isFinished); // !는 부정연산자
		
		System.out.println("======================================");		
		
		//비교연산자
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(3 < 5);
		System.out.println(4 <= 4);
		System.out.println(5 > 10);
		System.out.println(9 >= 8);
		
		System.out.println("======================================");
		//논리
		boolean b2 = (10 > 6) && (10 > 5);// true, true => true
		boolean b3 = (5 != 1) || !(10 < 4);// true, true => true : 느낌표가 false를 부정
		boolean b4 = (2 >= 1) && (3 < 4);// true, true => true
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("======================================");
		//대입
		int a = 30;
		a += 30; // a = a + 30
		a -= 5; //  a = a - 5
		a *= 3; // a = a * 3
		a /= 2; // a = a / 2
		a %= 4; // a = a % 4;
		
		System.out.println("======================================");
		//삼항연산자
		// 0~200 : 생수, 201~300 : 커피
		// 조건 ? true값 : false값;
		int point = 150;
		String eventItem = (point <= 200) ? "생수" : "커피";
		System.out.println(eventItem);
		
		// 0~200: 생수 / 201~300: 커피 / 301~400:맥주
		// true값 or false값에 한번더 삼항연산자 줄수있음.
		//200보다 크면 -> 300보다 크면 맥주, 작으면 커피(201~300)
		//200보다 작으면 -> 생수
		eventItem = (point > 200) ? (point > 300 ? "맥주" : "커피") : (point >= 0 ? "생수" : "사은품 없음");
		System.out.println(eventItem); //커피
		
		eventItem = (point > 200) ? ( (point>=201 && point<=300) ?  "커피" : "맥주") : "생수";
		
	}
	
}
