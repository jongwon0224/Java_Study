package study.practice.prac19;

import java.util.Scanner;

public class WeightAfterFiveMonths {

	public static void main(String[] args) {
		
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 몸무게를 입력하세요: ");		
		double start = scan.nextDouble(); // 몸무게
		
		System.out.print("N개월 후 : ");
		int after = scan.nextInt(); // 개월수
		System.out.println();
		// 계산
		double result = weight(start, after);
		
		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
	}
	
	// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
	public static double weight(double currentWeight, int months) {
		
		double expectedWeight = currentWeight;
		double gainWeight = 0.231; // 매달 찌는 몸무게
		
		for (int i=0; i<months; i++) {
			expectedWeight += gainWeight;
			System.out.printf("%d개월 후 : %.2fkg", i+1, expectedWeight);
			System.out.println();
		}
		
		return expectedWeight;
	}
}
