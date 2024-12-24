package study.inherit.inherit06;

public class ExMain {

	public static void main(String[] args) {
	
		Driver d1 = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		// 드라이버 클래스에 버스, 택시 메소드 따로 안만들고 부모 클래스인 vehicle을 인자값을 줘도 공통으로 호출됨
		// vehicle.run() => bus,taxi.run()으로 갔기때문에.
		
		d1.drive(b); // 드라이버 클래스에 버스 클래스 인자로 보냄
		d1.drive(t); // 드라이버 클래스에 택시 클래스 인자로 보냄
		
		Taxi ta = takeTaxi();
		Bus bu = takeBus();
		
		// vehicle은 부모클래스여서 bus, taxi클래스 상속가능
		Vehicle v = new Taxi();
		Vehicle v2 = takeBus();
		Vehicle b3 = takeBus2();
	
		//----------------------------
		Taxi d5 = new Taxi();
		Vehicle v5 = d5;
		v5.run();
		// d5객체를 v5로 형변환 해도 d5에서는 Taxi클래스 내부 메소드 실행가능
		d5.businessOn();
		d5.run();
		
		// 클래스도 형변환 됨 Vehicle v5 => (Taxi)v5로 가능
		Taxi t6 = (Taxi)v5;
		t6.businessOn();
		
		Vehicle v6 = new Vehicle();
		// 형변환 오류 -> 자식이 부모로 바꾸려하면 오류나는듯..
		// 그럴때 instanceof를 사용해서 해결
		if(v6 instanceof Taxi) {			
			Taxi t7 = (Taxi)v6;
		}
		
	}
		
		public static Taxi takeTaxi() {
			return new Taxi();
		}
		
		public static Bus takeBus() {
			return new Bus();
		}
		
		// vehicle타입 bus객체를 새로 생성해주는 메서드
		public static Vehicle takeBus2 () {
			return new Bus();
		}
	}



