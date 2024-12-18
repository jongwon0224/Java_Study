package study.practice.prac18;

public class Account {
	
	String num; // 계좌번호
	int balance; // 잔액
	
	public Account(String str, int i) {
		num = str;
		balance = i;
	}

	public String toString() {
		return String.format("Account { num: %s, balance: %d }", num, balance);
	}

	public boolean transfer(Account target, int amount) {
		
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			target.balance += amount;
			return true;
		}
	}
		
	
		
		
}
