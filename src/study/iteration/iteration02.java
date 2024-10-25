package study.iteration;

public class Iteration02 {

	public static void main(String[] args) {
		// 타입 뭔지 확인
//		String y = "d";
//		System.out.println(y.getClass());
		
//		for(초기; 반복; 증감) {
//			실행문;
//		}

//		while(조건){
//			실행문;
//		break; => 특정 조건에 멈춤
//		continue; => 특정조건을 건너뛰고 실행
//		}

//		do while 문
//		do(조건) {
//			조건문(반복문 사용 가능)
//		} while(조건)
	
		
		//for문 예제	
		for(int i=1; i<=5; i++) {
			System.out.println("피곤하다");
		}
		
		System.out.println("==========================================================");
		//while문은 변수가 들어가야됨
		int j = 1;
		while(j <= 5) {
			System.out.println("졸리다");
			j++;
		}
		System.out.println("==========================================================");
		
		// do while문은 while조건이 true일경우 while실행, false는 do조건 실행후 끝
		int k = 10;
		do {
			for(int i=0; i<10; i++) {
				System.out.println(i);				
			}} while(k<5);
		
		System.out.println("==========================================================");
		
		k = 1;
		while(true) {
//			System.out.println(k); // 1~9 -> 출력위치에 따라 시작숫자 달라짐
			k++;
			System.out.println(k); // 2~10 -> 출력위치에 따라 시작숫자 달라짐
			if(k == 10) {
				break;
			}
//			System.out.println(k); // 2~9 (10은 출력안됨)
		}
	
		System.out.println("==========================================================");
		
		//continue문
		//i가 5가 되었을때 한턴 쉬고 다시 실행 => 5빼고 출력됨
		for(int i=1; i<=10; i++) {
			if(i == 5)
				continue;

			System.out.println(i);
		}
		
	}
}
