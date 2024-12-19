package study.practice.prac19;

import java.util.ArrayList;
import java.util.Arrays;

public class TopScoreStudent {

	public static void main(String[] args) {
		
		
		// 배열 생성
		String[] names = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
		
		int maxIndex = 0;
		int maxValue = scores[0];
		
		/*
		for(int i=1; i<scores.length; i++) {
			
			if(maxValue < scores[i]) {
				maxIndex = i; // 1, 3, 5, 7
				maxValue = scores[i]; // 74, 75, 96, 98
			}
		}
		
		System.out.println(maxIndex);
		System.out.println(maxValue);
		*/
		
		// 1등 인덱스 검색
		int i = topIndex(scores);
		
		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}
	
	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		
		int indexArr[] = new int[9]; // index배열 생성
		int max = 0; // 점수 최대값
		int index = 0; // 인덱스 번호
		
		max = Arrays.stream(arr).max().getAsInt();
		
		for(int i=0; i<arr.length; i++) {
			indexArr[i] = i;
			
			if(arr[i] == max) {
				index = indexArr[i];
				System.out.println("index는 : " + index);
			}
		}
		
		return index;
		
	}

}
