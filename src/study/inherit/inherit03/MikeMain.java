package study.inherit.inherit03;
import java.util.*;

public class MikeMain {

	public static void main(String[] args) {
	
		
		BluetoothMike m1 = new BluetoothMike();
		WirelessMike m2 = new WirelessMike();
		Mike m3 = new Mike();
		
		
		m1.volumeUp();
		m1.volumeUp("ssdf");
		
		m2.volumeUp();
		
		m3.volumeUp();
		
		System.out.println(m1.toString());
		
		
		// Mike가 부모 / 그 밑에 자식이 BluetoothMike, WirelessMike
		// 자식이 부모를 상속 -> 불가능
		WirelessMike m4 = m2; // 부모가 자식을 상속가능
		Mike m5 = m1; // 부모가 자식 상속가능 
		Mike m6 = m2; // 부모가 자식 상속가능
		
		Mike m7 = new BluetoothMike(); // 부모가 자식 상속가능
		Mike m8 = new WirelessMike(); // 부모가 자식 상속가능
		
		// 배열로도 상속가능
//		Mike[] arr = new Mike[5];
		Mike [] arr = {new Mike(), new BluetoothMike(), new WirelessMike()};
	
		// 리스트로도 상속가능
		List <Mike> list = new ArrayList <Mike>(); // mike객체 리스트 생성 -> 빈값임 -> 마이크, 블루투스, 무선 객체 삽입
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());
		
		System.out.println(list); // [Mike객체, BluetoothMike객체, WirelessMike객체]
		
	}

}
