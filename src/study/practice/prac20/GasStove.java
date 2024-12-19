package study.practice.prac20;

public class GasStove {

	int burner, price, controlFire; // 화구, 가격, 불세기조절
	String brand; //브랜드
	boolean turnOn = false; // 불켜기, 끄기
	
	
	public void fireOn() {
		controlFire = 1;
	}
	
	public void fireOff() {
		controlFire = 0;
	}
	
	
	public void setControlFire (int controlFire) {	
		if(controlFire > 9) {
			System.out.println("다시 입력해주세요");
		} else {
			this.controlFire = controlFire;			
		}
	}	
	
}
