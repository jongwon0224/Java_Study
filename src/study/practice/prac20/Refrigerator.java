package study.practice.prac20;
import java.util.ArrayList;

public class Refrigerator {
	
	String brand; //브랜드
	int liter, doorNum, temperature; //리터, 문개수, 온도Up
	boolean isTurnOnOff = false; // 전원키기여부
	
	IceTray iceTray; // 아이스 트레이
	ArrayList <IceTray> iceTrayList;
	
	
	public Refrigerator() {
		
	}
	
	public Refrigerator(String brand, int liter, int doorNum, IceTray iceTray, int temperature) {
		this.brand = brand;
		this.liter = liter;
		this.doorNum = doorNum;
		this.temperature = temperature;
		this.iceTray = iceTray;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

	public IceTray getIce() {
		return iceTray;
	}

	public void setIce(IceTray ice) {
		this.iceTray = ice;
	}

	
	public void tempUp(int tempValue) {
		
		if(temperature > 5) {
			System.out.println("최대온도입니다.");
			temperature = 5;
		} else {			
			temperature += tempValue;
		}
	}
	
	public int tempDown(int tempValue) {
		this.temperature -= tempValue;
		return temperature;
	}
	
	public void turnOnOff () {
		if(isTurnOnOff) {
			isTurnOnOff = false;
		} else {
			System.out.println("전원이 켜졌습니다.");
			isTurnOnOff = true;			
		}
	}
	
	
}
