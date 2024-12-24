package study.inter.inter02;

public class BluetoothSpeaker implements Connectable {

	int connectStatus;
	
	public void connect() {
		System.out.println("블루투스 스피커 연결");
		connectStatus = Connectable.CONNECT_ON;
	}
	
}
