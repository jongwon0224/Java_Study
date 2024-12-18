package study.cls.cls09;
import java.util.ArrayList;

public class LectureRoom {

	int floor, roomNumber; // 층수, 강의실번호
	double pyeong; // 평수
	
	boolean hasWhiteBoard;
	
	AirCon airCon; // 데이터 타입으로 클래스 넣을수있음 -> AirCon클래스 불러옴 + airCon으로 변수명 줌
	WhiteBoard board; // 데이터타입으로 WhiteBoard클래스 넣음 -> board 객체로 관리
	
	// Desk desk (X) -> Desk가 여러개여서 일반 타입X, 배열이나 리스트로 -> Desk[] deskArr;
	private ArrayList<Desk> deskList = new ArrayList<Desk>();
	
	public LectureRoom() {
		floor = 0;
		roomNumber = 0;
		pyeong = 0;
		hasWhiteBoard = false;
		board = new WhiteBoard();
		airCon = null;
		deskList = null;
//		deskList = new ArrayList<Desk>();
	}
	
	public void setDeskList (ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void addDeskList (Desk desk) {
		
		if(this.deskList == null) {
			this.deskList = new ArrayList<Desk>();
		}
		this.deskList.add(desk);
	}
	
	public void setFloor (int floor) {
		this.floor = floor;
	}
	
	
	
	
}
