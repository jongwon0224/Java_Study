package study.practice;

import java.util.Arrays;

public class Prac14 {

	public static void main(String[] args) {
		
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		int count = 0;
		int [] arr = new int [6];
		int [] reverseArr = new int [6];
		
		for(int i=0; i<6; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			reverseArr[i] = arr.length - i;
		}
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if( (arr[i] + reverseArr[j]) == 6 ) {
					count += 1;	
				
				}
			}
		}

		
		System.out.println(count); // 경우의 수 총 계
		System.out.println(Arrays.toString(arr)); // 1번 주사위
		System.out.println(Arrays.toString(reverseArr)); // 2번 주사위
		

	}

}
