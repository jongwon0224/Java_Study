package study.practice;

import java.util.Arrays;

public class Quiz10 {

	public static void main(String[] args) {

		// 1.
		/*
		int num = 1;
		
		int [][] arr = new int [4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = num;
				num += 1;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		// 2.
		int num = 1;

		/*
		int [][] arr = new int [4][4];
		
		for(int i=0; i<4; i++) { // 0 1 2 3
			for(int j=0; j<4; j++) { // 1234  5678  9101112  13141516
				arr[j][i] = num;
				num++;
			}
		}
		
		for(int i=0; i<4; i++) { // 0 1 2 3
			for(int j=0; j<4; j++) { // 0 1 2 3   0 1 2 3   0 1 2 3  0123
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		//3.
		/*
		num = 1;

		
		int [][] arr = new int [4][4];
		
		for(int i=3; i>=0; i--) { // 0 1 2 3
			for(int j=3; j>=0; j--) { // 1234  5678  9101112  13141516
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<4; i++) { // 0 1 2 3
			for(int j=0; j<4; j++) { // 0 1 2 3   0 1 2 3   0 1 2 3  0123
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		//4.
		num = 16;

		int [][] arr = new int [4][4];
		
		for(int i=0; i<4; i++) { // 0 1 2 3
			for(int j=0; j<4; j++) { // 1234  5678  9101112  13141516
				arr[j][i] = num;
				num--;
			}
		}
		
		for(int i=0; i<4; i++) { // 0 1 2 3
			for(int j=0; j<4; j++) { // 0 1 2 3   0 1 2 3   0 1 2 3  0123
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
