package study.condition;

public class condition01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문
		
		int num = 5;
		int x = 10;
		
		if(num > 10) {
			System.out.print("확인을 해보니까 ");
			System.out.println("10보다 크다");
			x = 20; //지역변수 x는 아래에서 if문에서 못씀
		} else {
			System.out.println("10보다는 안크던데");
		}
		
		//불린 타입을 if문 조건으로 대입할수있음
		boolean b = num == 15;
		
		if(b) {
			System.out.print("한번더 살펴보니 ");
			System.out.println("15랑 똑같더라");
		
		}
		
		System.out.println(x); //if1번 x값이 참이면 x는 20으로 변환, 아니면 기존 그대로 10;
		System.out.println("끝");
	}

}
