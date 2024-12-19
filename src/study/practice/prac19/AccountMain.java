package study.practice.prac19;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a1 = new Account("Jong", 100000000);
		a1.getBalance(); // 초기 금액
		
		a1.setBalance(150000000); // 이후 금액
		a1.getBalance();
		
		a1.deposit(50000000); // 저축
		a1.getBalance();
		
		a1.withdraw(50000000); // 인출
		a1.getBalance();
		
		a1.withdraw(200000000); // 잔액부족 메시지
		a1.getBalance(); // 알람 후 잔액
		

	}

}
