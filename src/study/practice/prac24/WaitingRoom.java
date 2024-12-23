package study.practice.prac24;

public class WaitingRoom extends Room {
	// 필드
	int waterPurifier, microwave; 
	
	// 생성자
	public WaitingRoom (int waterPurifier, int microwave) {
		this.waterPurifier = waterPurifier;
		this.microwave = microwave;
	}
	
	public String getWaterPurifier() {
		String waterPurifierStr = (waterPurifier == 1) ? "있음" : "없음";
		return String.format("정수기 %s", waterPurifierStr);
	}
	
	// 메서드
	public void doorOpen () {
		isDoorOpen = true;
		System.out.printf("%s강의실 문이 열렸습니다.\n", name);
	}
}
