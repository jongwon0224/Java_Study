package study.practice.prac25;

class ExcerciseInstanceof {
	public static void main(String[] args) {
//		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
//		for(int i=0; i< arr.length;i++)
//			arr[i].action(arr[i]);
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	}
	
	// 강사님은 메소드를 메인클래스에 씀..
	public static void action (Robot robot) {
		if(robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
		} else if(robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		} else if(robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}
	}
}


class Robot {
	
//	void action(Robot r) {
//		if (r instanceof DanceRobot) {
//			((DanceRobot)r).dance();
//		} else if (r instanceof SingRobot) {
//			((SingRobot)r).sing();
//		} else if (r instanceof DrawRobot) {
//			((DrawRobot)r).draw();
//		}
//	}
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
