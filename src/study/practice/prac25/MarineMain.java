package study.practice.prac25;

public class MarineMain {

	public static void main(String[] args) {
		
		Unit u1 = new Marine();
		Unit u2 = new Tank();
		Dropship u3 = new Dropship();
		
		u1.move(3, 3);
		u2.move(5, 5);
		u3.move(10,10);
		
		u1.stop();
		((Marine)u1).stimPack();
		
		((Tank)u2).changeMode();
		
		u3.load();
		u3.unload();
	}

}
