package study.abst;

public class AbstractMain {

	public static void main(String[] args) {
		
		Coke c1 = new Coke();
		Tera t1 = new Tera();
//		Beverage b1 = new Beverage(); //추상 클래스 실체화 불가능
		
		// abstract는 객체 실체화되는 것만 막음 -> Beverage b1 = new Beverage(); 이게 실체화
		// beverage클래스는 부모클래스 역할 가능(공통필드)
		c1.name = "코카콜라"; 
		c1.ml = 330;
		c1.intro();
		
		Beverage b1 = new Tera();
		b1.intro();
		Tera t2 = (Tera)b1;
		
		Beverage[]bArr = {c1, t1};
		
		for (int i=0; i<bArr.length; i++) {			
			bArr[i].checkSafety();
		}
	}

}
