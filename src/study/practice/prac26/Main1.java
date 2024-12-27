package study.practice.prac26;

public class Main1 {
	
	public static void main(String[] args) {
		// 객체 생성
		KRW krw = new KRW("원", 1500);
		USD usd = new USD("달러", 100.50);
		EUR eur = new EUR("유로", 260.87);
		JPY jpy = new JPY("엔", 1400);
		
		// 부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };
		
		// 모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
		
		// getClass().getSimpleName() 하면 클래스명 출력
		System.out.println(usd.getClass().getSimpleName());
		System.out.println(jpy.getClass().getSimpleName());
//		System.out.println(eur.getClass().getTypeName());
		
	}
}

/* 1. 부모 클래스 Currency를 만드시오. */
/* 2. 상속을 통해 중복 코드를 제거 후, */
/* 3. 생성자를 올바르게 수정하시오. */
class Currency {
	public double amount;
	protected String notation; // 표기법(원)
	
	public Currency( String notation, double amount) {
		this.notation = notation;
		this.amount = amount;
	}
	
	/* 4. toString() 메소드를 오버라이딩 하시오. */
	public String toString() {
		return String.format("%s: %.2f %s", getClass().getSimpleName(), this.amount, this.notation);
	}
}


class KRW extends Currency {
	
	public KRW(String notation, double amount) {
		super(notation, amount);
	}
}

class USD extends Currency {
	

	public USD(String notation, double amount) {
		super(notation, amount);
	}	
}

class EUR extends Currency {
	
	public EUR( String notation, double amount) {
		super(notation, amount);
	}
}

class JPY extends Currency {

	public JPY(String notation, double amount) {
		super(notation, amount);
	}
}


