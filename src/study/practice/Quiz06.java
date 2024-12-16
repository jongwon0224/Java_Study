package study.practice;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		Scanner scanner = new Scanner(System.in);
		System.out.println("밑변 입력 : ");
		int under = scanner.nextInt();
		System.out.println("높이 입력 : ");
		int height = scanner.nextInt();
		System.out.printf("삼각형의 넓이는 %.3f", ((double)under*height/2));
//		System.out.println("삼각형의 넓이는 " + (double)under*height/2 + "입니다." );
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		int upper = scanner.nextInt();
		System.out.println("윗변 입력 : ");
		int under2 = scanner.nextInt();
		System.out.println("밑변 입력 : ");
		int height2 = scanner.nextInt();
		System.out.println("높이 입력 : ");
		System.out.printf("사다리꼴의 넓이는 = %.2f \n",((double)upper+under2)*height2/2);
	
	
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.	
	
//		int classNum = 24;
//		int snack = 100;
//		int perPerson = snack / classNum;
//		int left = snack % classNum;
//		System.out.println("한 명당 " + perPerson + "개를 받고 나머지는 " + left + "입니다.");
		
	
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8

//		System.out.println("3자리 정수 입력 : ");
//		int num = scanner.nextInt();
//		int count = num / 100;
//		System.out.println("백의자리 : " + count);
//		int count2 = num % 100 / 10;
//		System.out.println("십의자리 : " + count2);
//		int count3 = num % 10;
//		System.out.println("일의자리 : " + count3);
		
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
//		int x = 10;
//		int y = 20;
//		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
//		
//		int z = x;
//		x = y;
//		y = z;
//		
//		System.out.println("x="+x+ " y="+y);
		
		
	
	}

}
