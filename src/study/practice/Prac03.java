package study.practice;

import java.util.Scanner;

public class Prac03 {

	public static void main(String[] args) {
		
// 1번 문제.
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력해주세요");
		int[] numArr = new int[5];

		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		
		System.out.println("몇번째 수인가요?");
		int index = scanner.nextInt() - 1;
		System.out.println("결과 : " + numArr[index]);
		*/
		
		
		/*
//	2번
//		i를 반대로 출력하기 => int i=4; i>=0; i--로 해야됨
// 		i값이 0보다 크지만 4니까 4,3,2,1 로 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력해주세요");
		
		int[] numArr = new int[5];
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		for(int i=4; i>=0; i--) {
			System.out.println(numArr[i]);
		}
		*/


		
		
//	3번	
		
		
//		int[][] numberArray = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
//		
//		
//		for(int i=0; i<numberArray.length; i++) {
//			for(int j=0; j<numberArray.length; j++) {
//				System.out.printf("%3d", numberArray[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		int num = 0;
		int[][] nArr = new int[4][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nArr[i][j] = num++;
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		
		

		
		
		
		
		
		
		
		
	}

}
