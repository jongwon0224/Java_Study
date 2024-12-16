package study.practice;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		
		int num = 10;
		String result = (num > 0 ? "양수" : (num == 0 ? "0" : "음수" ));
		System.out.println(result);
		
		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int firstNum = scanner.nextInt();
		System.out.println("입력한 숫자 = " + firstNum);
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		int secondNum = scanner.nextInt();
		System.out.println("입력한 숫자 = " + secondNum);
		
//		System.out.println("더하기 : " + firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
//		System.out.println("빼기 : " + firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
//		System.out.println("곱하기 : " + firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
//		System.out.println("나누기 : " + firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
		
		System.out.printf("더하기 : %d + %d = %d\n" , firstNum, secondNum, firstNum + secondNum);
		System.out.printf("빼기 : %d - %d = %d\n" , firstNum, secondNum, firstNum - secondNum);
		System.out.printf("곱하기 : %d * %d = %d\n" , firstNum, secondNum, firstNum * secondNum);
		System.out.printf("나누기 : %d / %d = %.2f\n", firstNum, secondNum, firstNum/(double)secondNum);
		
	}

}
