package study.inherit.inherit03;

public class Parent {

	String nation;

	public Parent() {
		this("대한민국");
		System.out.println("parent call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("parent String nation call");
	}
}
