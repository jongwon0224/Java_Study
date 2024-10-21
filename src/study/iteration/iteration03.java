package study.iteration;

public class iteration03 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) { //1~5
			System.out.println("for i 내부 실행문 시작" + i);
			
			for(int j=1; j<=3; j++) {
				System.out.println("for j 실행문 " + j);				
			}
			System.out.println("for i 내부 실행문 끝");
		}

		
		for(int i=1; i<=3; i++) {
			System.out.println("방 " + i + " 개");
			
			int j = 1;
			while(j <= 2) {
				System.out.println("쓸기");
				j++;
			}
			
			for(int k=1; k<=3; k++) {
				System.out.println("닦기");
			}
			
			for(int l=1; l <= 1; l++) {
				System.out.println("쓰레기정리");
			}
		}
		
		
	}

}
