package study.practice.prac24;


public class LectureRoom  extends Room {
	// 필드
	int computer, studentNum;
	
	// 생성자
	public LectureRoom (int computer, int studentNum) {
		this.computer = computer;
		this.studentNum = studentNum;
	}
	// 메서드
	public void doorOpen () {
		isDoorOpen = true;
		System.out.printf("%s강의실 문이 열렸습니다.\n", name);
	}
}
