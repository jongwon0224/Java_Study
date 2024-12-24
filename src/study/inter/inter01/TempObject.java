package study.inter.inter01;

public class TempObject implements Temp, Temp2 {

	// 인터페이스에서는 abstract처럼 인터페이스안에 메소드를 구현해야됨
	public void method1() {
		System.out.println("method1");		
	}
	
	public void method2() {
		System.out.println("method2");
	}

	
	public void method3() {
		System.out.println("method3");
		
	}
	

	
}
