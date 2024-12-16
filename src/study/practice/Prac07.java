package study.practice;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) { // i ->   1       2       3     4    5
				System.out.print("*");// j -> 54321    5432    543    54   5
			}
			System.out.println();
		}
		
		
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
		/*
		for(int i=1; i<5; i++) {    //      1      2      3        4        
			for(int j=0; j<i; j++) {//      0     0 1   0 1 2   0 1 2 3
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요오");
		int num = scanner.nextInt();
		
		for(int x=1; x<=num; x++) {
			for(int y=1; y<=num; y++) {
				if(x * y == num) {
					System.out.printf("%3d",x);				
				} 
			}
		}
		*/
		
		
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("숫자를 입력해주세요");
		int input = scanner.nextInt();
										  // input = 3
		for(int i=1; i<=input; i++) {     //     1      2     3
			for(int j=1; j<=i; j++) {     //    1      12    123
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<input; i++) {       //      0    1     2
			for(int j=input-1; j>i; j--) { //     21    2     
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		

//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		/*
		int num = 0;
		for(int i=1; i<=10; i++) {     //1    2     3       4       5     6          7           8        9           10
			
			for(int j=1; j<=i; j++) {  // 1  12   123     1234    12345  123456     1234567  12345678 123456789 12345678910 
				num += j;
			}
			System.out.println(num);
		}
		*/
		
		
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.

		/*
		int i = 1;
		int total = 0;
		
		while(i < 1000) {      // true값
			if(i % 2 == 0) {   // 짝수는 빼기
				total -= i;
			} else {		   // 홀수는 더하기
				total += i;
			}
			
			if(total >= 100) { // 총합 100이상일때 스탑
				break;
			}
			i++;               // 계속 더하기
		}
		System.out.println("마지막 더한 숫자 : " + i);
		System.out.println("더한 숫자 총합 : " + total);
		*/
		
		/*
		int i; // 변수 선언만 하기 -> 그래야 for문에서 사용가능.
		int total = 0;
		
		for(i=1; total<100; i++) {
		
			if(i % 2 == 0) {
				total -= i;
			} else {
				total += i;
			}
		
		}
		System.out.println("누적합 : " + total + " 마지막 숫자 : " + (i-1));
		*/
	}

}
