package study.practice;

import java.util.Arrays;

public class Prac09 {

	public static void main(String[] args) {

		/*
		int[][] arr = { {1,2,2,2,2},{3,1,2,2,2},{3,3,1,2,2},{3,3,3,1,2},{3,3,3,3,1} };
		//System.out.println(arr);
		
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		int[][] arr = new int [5][5]; // 배열 기본값 0으로 설정됨.
		
		for(int i=0; i<5; i++) { 		// 0              1            2         3         4
			
			for(int j=0; j<5; j++) {	//1,2,2,2,2   3,1,2,2,2   3,3,1,2,2  3,3,3,1,2  3,3,3,3,1
				
				if(i > j) {
					arr[i][j] = 3;
				} else if (i < j) {
					arr[i][j] = 2;
				} else {
					arr[i][j] = 1;
				}
			}
		}
	
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
				
		
	
	
	
	
	
	
	
	}
	
	

}
