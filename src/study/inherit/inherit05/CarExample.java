package study.inherit.inherit05;


public class CarExample {
	public static void main(String[] args) {
		Tire t1 = new HankookTire("앞왼쪽",15);
		Tire t2 = new HankookTire("앞오른쪽",15);
		Tire t3 = new HankookTire("뒤왼쪽",15);
		Tire t4 = new HankookTire("뒤오른쪽",15);
		
		Car car = new Car(t1, t2, t3, t4);
		
		
		for(int i=1; i<=10; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
//			case 1:
			case Car.FRONT_LEFT_TIRE:
				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
	
				// 배열일때 코드 알맞게 수정
				car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15);
//				car.tireList.get(0) = new HankookTire("앞왼쪽", 15);
				break;
//			case 2:
			case Car.FRONT_RIGHT_TIRE:	
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);	
				break;
//			case 3:
			case Car.BACK_LEFT_TIRE:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);	
				break;
//			case 4:
			case Car.BACK_RIGHT_TIRE:
				System.out.println("뒤오른쪽 NexenTire로 교체");
				car.tireArr[Car.BACK_RIGHT_TIRE] = new NexenTire("뒤오른쪽", 25);		
				break;
//				System.out.println("뒤오른쪽 KumhoTire로 교체");
//				car.backRightTire = new KumhoTire("뒤오른쪽", 17);		
//				break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
