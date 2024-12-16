package study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		
		
//		연습문제 - 2

//		1. 2x + 4y = 10 이 만족하는 	모든 x, y 쌍을 구하시오.	(x와 y는 자연수 1~10)
		
		
		int [] Array = {1,2,3,4,5,6,7,8,9,10};
			
		for(int x=0; x<Array.length; x++) {
			for(int y=0; y<Array.length; y++) {				
				if(2*x + 4*y == 10) {
					System.out.println("x는 : " + x + " y는 : " + y);
				}
			}	
		}
		
		
		
		
//		2. 정수 2개를 입력 받아서, 아래 계산 결과를 출력하시오. 큰수 - 작은수
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int [] numArray = new int [2];
		for(int i=0; i<numArray.length; i++) {
			numArray[i] = scanner.nextInt();
		}
		if(numArray[0] > numArray[1]) {
			System.out.println(numArray[0] + "-" + numArray[1]);
		} else {
			System.out.println(numArray[1] + "-" + numArray[0]);
		}
		*/
		
		
//		3.	윷놀이 게임 	4개의 윷을 입력받고 결과를 출력하시오.	(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		Scanner scanner = new Scanner(System.in);
		System.out.println("0과 1중에서 숫자 4개를 입력해주세요");
		
		int [] gameArr = new int [4];
		int total = 0;
		
		
		for(int i=0; i<gameArr.length; i++) {
			gameArr[i] = scanner.nextInt();
			total += gameArr[i]; // 총합 값을 여기서 받아도 됨. 굳이 반복문 하나 더 안만들어도됨
		}
		
//		System.out.println(Arrays.toString(gameArr)); 자바 배열 확인하는 방법

		
		if(total == 1) {
			System.out.println("도");
		} else if(total == 2) {
			System.out.println("개");
		} else if(total == 3) {
			System.out.println("걸");
		} else if(total == 4) {
			System.out.println("윷");
		} else if(total == 0) {
			System.out.println("모"); 
		}else {
			System.out.println("숫자를 다시 입력해주세요.");
		}
		
		
		
		
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
		/*
		System.out.println("숫자를 입력해주세요");		
		int num = scanner.nextInt();
		
		for(int j=0; j<num; j++) {
			System.out.print("*");								
		}
		System.out.println();
		*/

		
	}
}

