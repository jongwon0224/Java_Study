package study.inherit.inherit01;

public class InheritMain {

	public static void main(String[] args) {
		
		Parent p1 = new Parent(1000);
		
		p1.say();
		
				
		Child c1 = new Child();
		c1.play();
		c1.say();
		
		Child c2 = new Child(5, "중앙초", 3000);
		c2.say();
		c2.play();
//		System.out.println(c2.grade + c2.schoolName + c2.money);
		c2.printInfo();

	}

}
