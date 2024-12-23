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



