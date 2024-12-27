package study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		
		Temp tt = null;
		
		if(tt != null) {
			tt.t = 10;
		}
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("숫자 입력하세요:");
		
//		int in = scanner.nextInt();	//숫자입력시 오류
		
		String s = scanner.nextLine(); // 문자입력시 오류
		int n = 0;
				
//		예외처리코드를 통해 오류가 나도 다음코드가 실행이 되게 해줌 (e.printStackTrace())
//		e.printStackTrace -> 해당 오류를 출력해주고 다음으로 넘어감	
		
		// 오류안날경우 : 1.try부분실행 2. finally부분실행
		// 오류날경우 : 1.try부분실행 예외나올시 바로 2. catch부분실행 3.finally실행
		
		// ex. parseInt전 실행 -> n=integer~~실행 -> 예외나옴 -> parseInt후 실행안하고 -> catch부분실행 -> finally 넘어감
		try {
			System.out.println("parseInt전");
			n = Integer.parseInt(s);		
			System.out.println("parseInt후");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("여기 finally");
		}
		
		System.out.println("입력한 숫자는 :"+ n);
		
		// 예외처리를 꼭 해야됨.. Class.forName("java.lang.String2")를 사용하려면..
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


class Temp {
	int t;
	
}
