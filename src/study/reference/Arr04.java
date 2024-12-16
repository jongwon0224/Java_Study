package study.reference;

import java.util.Arrays;

public class Arr04 {

	public static void main(String[] args) {
		
		// 배열 참조타입 vs int 기본타입
		
		/*
		//복사가 안된 케이스 (arr1의 0인덱스 값도 바뀜 ... 오류 나옴)
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;   // arr1의 주소 가지고있음 => 결국은 arr1, arr2값이 같음.
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " "); // 10, 20, 30
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " "); // 10, 20, 30
		}
		System.out.println();
		
		// 0인덱스값을 바꿔도 arr1의 0인덱스도 바뀜
		// arr2가 arr1의 주소를 복수했기 주소에 있는 값을 바꿔서 같이바뀜
		arr2[0] = 999;	
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " "); // 999, 20, 30
		}
		System.out.println();  // 0인덱스값 바뀜 -> 999
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " "); // 999, 20, 30
		}
		System.out.println();
		*/
		
		// 배열 복사하는 방법
		// 1.for문을 이용해서 요소 하나 하나를 복사
		// arr1의 값이 안바뀜 => arr2 = arr1은 주소복사여서 값이 바뀜
		/*
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];   // 배열을 하나 생성해버리기, 주소복사는 안함
		
		for(int i=0; i<3; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr1[i]+ " "); // 10, 20, 30
			System.out.print(arr2[i]+ " "); // 10, 20, 30
		}		
		*/
		
		// 2. System.arraycopy를 활용하여 배열 복사하기
		/*
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];   // 배열을 하나 생성해버리기, 주소복사는 안함
		//              복사대상,위치,저장할대상,위치,개수 => splice개념이랑 비슷한듯
		System.arraycopy(arr1, 0, arr2, 0, 3); 
		//			arr1의 인덱스0을 arr2의 인덱스0으로 3개 복사
		System.out.println(Arrays.toString(arr2)); // 10 20 30
		System.out.println(Arrays.toString(arr1)); // 10 20 30
		*/
		
		int[] arr = {10, 20, 30, 40, 50};
		/*
		// 기존 for문
		
		for(int i=0; i<5; i++) {
			System.out.println(i + " :" + arr[i] + " ");
		}
		*/
		
		//향상된 for문
		// 조건식이나 증감식 사용 안함
		// int i말고 그냥 변수명 설정하면 됨
		/*
		int sum = 0;
		for(int i : arr) { // arr의 값을 i에 넣어줌 => i에 arr의 값이 들어있는 상태
//			System.out.println(i + " "); // 10,20,30,40,50 출력
			sum += i;
		}
		System.out.println(sum); // 150
		*/
		//예시;
		/*
		sum = 0;
		int[] scores = {90,95,100,80,75};
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		*/
		int[] scores = {90,95,100,80,75};
		
		
		for(int score : scores) {
			System.arraycopy(scores, 0, score, 0, 5);			
			System.out.println(score);
		}
		
		
	}

}
