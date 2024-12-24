package study.practice.prac25;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			arr[i].action(arr[i]);
	} // main
}


class Robot {
	
	void action(Robot r) {
		if (r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		} else if (r instanceof SingRobot) {
			((SingRobot)r).sing();
		} else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}
	}
}


class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}


class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}


class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
