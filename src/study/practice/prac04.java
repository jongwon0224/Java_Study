package study.practice;

import java.util.Scanner;

public class Prac04 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요 : ");
		int korean = scanner.nextInt();
	
		System.out.print("수학점수를 입력해주세요 : ");
		int math = scanner.nextInt();
		
		System.out.print("영어점수를 입력해주세요 : ");
		int english = scanner.nextInt();

		int sum = korean + math + english;
		double avg = sum / 3.0;
		
		if(korean >= 40 && math >= 40 && english >= 40 && avg >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		/*
		int [] scoresArr = new int [3];
		int sum = 0;
		double avg = sum / 3.0;

		String [] title = {"국어","수학","영어"};
		
		System.out.println("국어, 수학, 영어 점수를 입력해주세요.");
		for(int i=0; i<3; i++) {
			scoresArr[i] = scanner.nextInt();
		}
		
		for(int j=0; j<3; j++) {
			sum += scoresArr[j];
			System.out.println(title[j]+" : "+ scoresArr[j]);
		}
			
		if(scoresArr[0]>=40 && scoresArr[1]>=40 &&scoresArr[2]>=40 && avg>=60) {
			System.out.println("총합 : " +sum);
			System.out.println("평균 : " +avg);
		} else {
			System.out.println("불합격입니다.");
		}
		*/
		
		
		
		
		
	
		
		
		
	}
		

}
