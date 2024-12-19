package study.practice.prac19;

public class Account {
	
	private String owner;
	private long balance; // 8byte?
	
	
	public Account (String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public void setOwner (String owner) {
		this.owner = owner;
	}
	
	public void setBalance (long balance) {
		this.balance = balance;
	}
	
	public String getOwner () {
		System.out.println(this.owner);
		return this.owner;
	}
	
	public long getBalance () {
		System.out.println(this.balance);
		return this.balance;
	}
	
	// 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	// 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
	public long withdraw(long amount) {
		
		if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= amount;
		}
		return balance;
		
	}
	
	
}
