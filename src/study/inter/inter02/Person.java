package study.inter.inter02;

public class Person {

	// Phone p; 만약 Phone이 갤럭시,아이폰의 부모클래스였으면 Phone객체만 사용할수있음
//	GalaxyPhone gp;
//	IPhone ip;
	
	Callable callPhone; //(new galaxyPhone(), new IPhone())
	
	public void call (String phoneNumber) {
		if(phoneNumber.length() == 11 && phoneNumber.substring(0,2) == "010") {			
			callPhone.callON();
		} else {
			System.out.println("전화번호를 확인해주세요");
		}		
	}
}
