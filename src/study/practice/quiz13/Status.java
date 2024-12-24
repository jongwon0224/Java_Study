package study.practice.quiz13;

public class Status {
	
	int office, month, day; //근무중인지, 연차인지, 조퇴인지, 몇월, 몇일
	
	
	public Status(int office, int month, int day) {
		this.office = office;
		this.month = month;
		this.day = day;
	}

	// office 1은 출근 , 2는 휴가, 3은 병가
	public void setOffice(int office) {
		this.office = office;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setday(int day) {
		this.day = day;
	}

	

	
	
	

}
