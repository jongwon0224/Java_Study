package study.practice.prac24;

public class Room {
	// 필드
	String name;
	int door, projector, chair, desk, airCon;
	boolean isDoorOpen; //문열렸나 체크

	// 생성자
	public Room () {
		
	}
	
	// 생성자
	public Room (String name, int door, int projector, int chair, int desk, int airCon) {
		this.name = name;
		this.door = door;
		this.projector = projector;
		this.chair = chair;
		this.desk = desk;
		this.airCon = airCon;
	}
	
	public void setName(String name) {
        this.name = name;
    }
	
	public boolean isDoorOpen() {
        return isDoorOpen = true;
    }
	
	// 메서드
	public void doorOpen () {
		if(isDoorOpen) System.out.printf("%s강의실 문이 열렸습니다.\n", name);
	}
	
	
}
