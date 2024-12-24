package study.inter.inter02;

import java.util.ArrayList;
import java.util.List;

public class InterMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.callPhone = new IPhone();
		
		p.call("01000000000");
		
		p.callPhone = new GalaxyPhone();
		p.call("010-0000-0000");
		
		List <Person> list = new ArrayList <Person>();
		list.add(p);
		// 람다식 for each문
		list.forEach(Person -> System.out.println(Person));
		
	}

}
