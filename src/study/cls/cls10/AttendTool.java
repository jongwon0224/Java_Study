package study.cls.cls10;

public class AttendTool { //출결도구
	
	boolean isOn;
	String forOrg; // 어느기관을 위한 존재
	// 센터서버 -> 학생명단

	// 출석체크결과 -> 정상true, 실패false
	// int 1=출석성공, 2=퇴실성공, 3=실패
	public int checkAttend2(Card card) {
		// card확인
		// 오늘기록X -> 출석처리
		return 1;
		
		// 출석기록 -> 다시찍으면 퇴실 처리
		// return 2;
		
		// 문제 -> 처리실패
		// return 3;
	}
	
	public boolean checkAttend(Card card) {
		// 구성원목록
		
		// 목록 == card.id
		
		// 출석상태 체크
		
		// X -> 출석O, O -> 퇴실
		return true;
	}
	
	// 출결체크 (학생지문 + 카드)
	public boolean checkAttend3(Card card, Student s) {
		//s.card
		//s.hand
		
		return false;
	}
	
}
