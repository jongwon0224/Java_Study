package study.practice.prac18;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		// 송금: 3천원씩 b 계좌에서 -> a계좌로!
		boolean result = true;
		
		while (result) {
//		result = a.transfer(b, 3000);
		result = b.transfer(a, 3000);
		}

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
		
	
	
	
	
	
	}
		
		

	

}
