package study.cls.cls09;
import java.util.ArrayList;

public class ClsMain {

	public static void main(String[] args) {
		
		LectureRoom room = new LectureRoom();
		room.floor = 7;
		room.roomNumber = 3;
		room.pyeong = 30;
		room.hasWhiteBoard = true;
		
		
		// 1. 화이트보드 객체 만들기
		// LectureRoom클래스에서 board를 가져오는경우
		// LectureRoom클래스 생성자에서 객체생성
		room.board.sizeX = 1200;
		room.board.sizeY = 800;
		room.board.price = 120000;
		room.board.isMagnetic = true;
		
		// 2. main에서 board클래스 생성후 변수 넣기 -> 그 후, LectureRoom클래스 board에 데이터 넣기
//		WhiteBoard board = new WhiteBoard();
//		board.sizeX = 1200;
//		board.sizeY = 800;
//		board.price = 120000;
//		board.isMagnetic = true;
//		
//		room.board = board;
		
		// 에어컨 객체 만들기
		AirCon con = new AirCon();
		room.airCon = con;
	
		// 예외처리 -> addDeskList메소드에 if문 사용해서 안정적으로 오류잡음
		room.addDeskList(new Desk(50,50,"검정")); // null값 오류 안나오게 잡음
		
		// 1. 렉처룸에 데스크가 없을경우 직접 객체생성
		// lectureRoom의 deskList가 null일경우
		ArrayList<Desk> deskList = new ArrayList<Desk>();
		
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "흰색";
			deskList.add(d); // 10개 반복되어서 추가
		}
		
//		room.deskList = deskList;
		room.setDeskList(deskList); //setter

		//getter를 통해서 list불러오고 한개씩 add한후 setter로 지정
		room.addDeskList(new Desk(500,500,"검정색"));
		
		
		for(int i=1; i<=5; i++) {	
			deskList.add(new Desk(1200,600,"오크색")); // 5개 반복되어서 추가
		}
		
		
		/*
		// 2. 책상 객체 만들기 -> 렉처룸 클래스 생성자에서 미리 초기화함
		room.deskList = new ArrayList<Desk>(); //렉처룸에서 데스크가 없을경우 : 생성자 사용 안하고 메인에서 생성
		Desk d1 = new Desk();
		room.deskList.add(new Desk());		
		room.deskList.add(d1);
		
		// 800 * 600 : 10개
		// 1200 * 600 : 5개
		for(int i=1; i<=10; i++) {
			room.deskList.add(new Desk(800,600,"흰색")); // Desk d 새로 생성안하고 바로 변수 대입
		}
		
		for(int i=1; i<=5; i++) {	
			room.deskList.add(new Desk(1200,600,"오크색")); // 5개 반복되어서 추가
		}
		*/
	}

}
