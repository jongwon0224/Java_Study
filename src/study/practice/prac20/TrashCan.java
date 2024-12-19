package study.practice.prac20;

public class TrashCan {

	int liter, percent; //리터, 몇퍼센트참?
	String color; //색상
	boolean isCoverOpened; // 쓰레기통 열기



	public void openCover() {
		isCoverOpened = true;
	}

	public void closeCover() {
		isCoverOpened = false;
	}

	
	public void emptyTrashCan() {
		percent = 0;
	}
	
	public void insertTrash(int percent) {
		this.percent += percent;
	}
	
	public void insertTrashLiter(int liter) {
		this.percent = percent + (liter/this.liter * 100);
	}





}
