package study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		
		//기본생성자
				Calc c1 = new Calc();
				
				c1.powerOn();
				
				Calc c2 = new Calc();
				
				c2.powerOn();
				
				c1.setOwner("내이름");	//return void
				
				c2.setOwner("너이름");
				
				double result1 = c1.divide(10, 5);
				System.out.println(result1);
				
				System.out.println( c2.divide(3, 2) );
				
				String result2 = c1.madeByInfo();
				System.out.println(result2);
				
				System.out.println( c2.madeByInfo() );

	}

}
