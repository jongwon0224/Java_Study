package study.practice;

import java.util.Arrays;

public class Prac17 {

	public static void main(String[] args) {
		
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		
		int[][] arr = { {10, 20, 30},{20, 30, 40},{30, 40, 50} };

//			{ {10, 20, 30, 60},{20, 30, 40, 90},{30, 40, 50, 120} {60, 90, 120, 270} }
		int [][] newArr = new int [4][4];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j]; // 배열복사
				
				newArr[i][3] += arr[i][j];
				newArr[3][j] += arr[i][j];
				newArr[3][3] += arr[i][j];
			}
		}
		
		System.out.println(Arrays.toString(newArr[0]));
		System.out.println(Arrays.toString(newArr[1]));
		System.out.println(Arrays.toString(newArr[2]));
		System.out.println(Arrays.toString(newArr[3]));
	
	}

}
