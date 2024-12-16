package study.practice;

import java.util.Arrays;

public class Prac15 {

	public static void main(String[] args) {
		
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용

		int [] lotto = new int[6];
		int index = 0;
		boolean isDuplicated = false;
		
/*
		while(true) {
			//랜덤값 뽑기
			int value = (int) (Math.random() * 45) + 1;
			
			// 중복체크
			isDuplicated = false;
			
			for(int i=0; i<index; i++) {
				
				if(lotto[i] == value) {
					isDuplicated = true; //중복체크
					break;
				}
			}
			//중복이다?
			if(isDuplicated) {
				isDuplicated = false;
				continue;
			}
			
			lotto[index] = value;
			index++;
				
			if(index == 6) {
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));
	*/
	

		for(int i=0; i<lotto.length; i++) {
			lotto[i] =  (int) (Math.random() * 45) + 1;

			for(int j=0; j<i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}	
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
}



