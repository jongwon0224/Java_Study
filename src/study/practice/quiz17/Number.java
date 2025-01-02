package study.practice.quiz17;

public class Number {
	
	int odd;
	int even;
	
	public Number(int odd, int even) {
		this.odd = odd;
		this.even = even;
	}
	
	public synchronized int addOdd() {
		int current = odd;
		odd += 2;
		return current;
	}
	
	public synchronized int addEven() {
		int current = even;
		even += 2;
		return current;
	}
	
}
