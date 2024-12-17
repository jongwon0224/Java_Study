package study.cls.cls06;

public class SingletonMain {

	public static void main(String[] args) {
	
// 		Singleton 생성자 private지정으로 외부에서 생성불가
//		Singleton s1 = new Singleton();
		
		Singleton st = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
		Singleton st4 = Singleton.getInstance();
		
		
		
		
	}

}
