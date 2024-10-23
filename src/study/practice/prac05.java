package study.practice;

import java.util.Scanner;

public class prac05 {

	public static void main(String[] args) {

//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		*/
		
		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		/*
		System.out.println("정수를 입력해주세요");
		
		num = scanner.nextInt();
		if(num % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		*/
		
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		/*
		int sum = 0;
		for(int i=5; i<=1000; i=i+5) { // 배수일때는 i=5 , i=i+5해야됨
			sum += i;
		}
		System.out.println(sum);
		*/
		
		
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~50까지 아무 숫자를 입력해주세요");
		
		int number = scanner.nextInt();
		for(int i=0; i<number; i++) {
			if(number <= 50 && number >= 1) {				
				System.out.print("*");
			} else {
				System.out.println("");
			}
		}
		System.out.println();
		*/
		
		
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		/*
		int Total = 0;
		int [] numArry = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=numArry.length; i++) { //i<numArry.length하면 9가 나옴 / 조심..
			if(i%2 == 1) {
				Total += i;
			} else {
				Total -= i;				
			}
		}
		System.out.println(Total);
		*/
		 
		
		
//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		/*
		int total = 0;
		int i = 1;
		while(total < 1000) {
			total += i;
			i++;
		}
		System.out.println(total);

		total = 0;
		i = 1;
		while(true) {
			total += i;
			i++;
			
			if(total >= 1000) {
				break;
			}
		}
		System.out.println(total);
		*/
		

//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%2d * %1d = %2d\n", inputNum, i, inputNum*i);
		}
		*/
		
		
	}

}
