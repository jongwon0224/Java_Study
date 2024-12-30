package study.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//숫자들을 set 사용하고싶으면?
		// Wrapper Class
		// int -> integer
		// double -> double
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		System.out.println(set1.isEmpty()); // true
		
		System.out.println(set1.add("A")); // return해줘서 true/false로 반환
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size()); // 3
		// set은 중복 알아서 걸러줌 => 추가 X
		set1.add("C");
		set1.add("C");
		set1.add("D"); // 이거만 추가해줌
		
		System.out.println(set1.size()); // 4
		
		// iterator는 반복해주면서 내부값을 순서대로 반환해줌
		// i1.hasNext() => 다음 값이 존재하는지 확인
		// i1.next() => 다음 값 읽어오기
		Iterator<String> i1 = set1.iterator();
		
		while(i1.hasNext()) { // i1 다음 값이 존재하면 true, 없으면 false
			String n = i1.next();
			System.out.println(n);
		}
	}

}
