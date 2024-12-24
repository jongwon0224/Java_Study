package study.practice.prac25;

class Marine extends Unit { // 보병
	
	String name = "Marine";
	
	// 지정된 위치로 이동
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s : %d, %d 만큼 이동 !\n", name, x,y);
	}
	
	//스팀팩을 사용한다
	void stimPack() {
		System.out.printf("%s : 스팀팩 사용\n", name);
	} 
}


class Tank extends Unit { // 탱크
	String name = "Tank";
	
	// 지정된 위치로 이동
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s : %d, %d 만큼 이동 !\n", name, x,y);
	}
	
	// 공격모드를 변환한다
	void changeMode() { 
		System.out.println(name + " : 공격모드 변환");
	} 
}


class Dropship extends Unit { // 수송선
	String name = "Dropship";
	
	// 지정된 위치로 이동
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s : %d, %d 만큼 이동 !\n", name, x,y);
	}
	
	// 선택된 대상을 태운다
	void load() {
		System.out.println(name + " : 선택된 대상을 태움");
	}
	
	//선택된 대상을 내린다
	void unload() {
		System.out.println(name + " : 선택된 대상을 내림");
	} 
}
