package study.iteration;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class iteration01 {

	public static void main(String[] args) {	
		// for문을 활용한 10단위로 더하기 방법 1.
		int sum = 0;
		for(int i = 10; i <= 100; i=i+10) {
//			sum += i;
			sum = sum + i;
			System.out.println("10~100까지(10단위) 합 : " + sum); //550
		}
		
		// for문을 활용한 10단위로 더하기 방법 2.
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 = sum1 + i*10;
			System.out.println(sum1); //550
		}

		System.out.println(sum + sum1);
		
//		for(int k = 2; k < 20; k = k*2) {
//			System.out.println(k);
////			2,4,8,16
//		}
		
//		for(int k = 400; k > 100; k=k-50) {
////			400,350,300,250,200,150
//			System.out.println(k);
//		}
//		
//		for(int k = 100; k >= 90; k--) {
////			100,99,98,97,96~90
//		}
		
		
		// 배열 설정후 출력
		String[] days = {"월요일","화요일","수요일","목요일","금요일"};
		for(int i=0; i<=days.length; i++) {
			System.out.println("오늘은 "+ days[i] + " 입니다.");
		}
	
		
	
	}

}
