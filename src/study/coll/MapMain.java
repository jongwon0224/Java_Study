package study.coll;

import java.util.*;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		// Map컬렉션
		// json object {key : value}

		//key, value
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		// Map<Integer, String>이여서 map1.put(숫자, 문자) 입력
		map1.put(1, "김하나");
		map1.put(2, "김둘");
		map1.put(3, "김셋");
		
		//키값확인 : map1.containsKey()
		System.out.println(map1.containsKey(2)); //true 
		System.out.println(map1.containsKey(4)); // false
		
		//밸류값 확인 : map1.containsValue()
		System.out.println(map1.containsValue("김하나")); //true 
		System.out.println(map1.containsValue("김황")); //false 
		
		//밸류값 출력 : map1.get(key값)
		System.out.println(map1.get(3)); // 김셋

		// map1 키값 출력 방법 2가지
		// 1번 : iterator사용
//		Set <Integer> map1Key = map1.keySet();
//		System.out.println(map1Key.iterator());
		
		// 2번 : forEach문 사용 (키값 출력)
		for(Integer key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key)); // value값 뽑는법
		}
		
		// 2번 : forEach문 사용 (밸류값 출력)
		for(String value : map1.values()) {
			System.out.println(value);
		}
		
		// entrySet은 하나의 배열로 데이터를 가져옴
		//System.out.println(map1.entrySet()); // [1=김하나, 2=김둘, 3=김셋]
		//System.out.println(map1); // {1=김하나, 2=김둘, 3=김셋}
		 
		Set <Entry <Integer, String> > entrySet = map1.entrySet();
		// entrySet으로 키 밸류값 출력
		for (Entry <Integer, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// 그냥 for each문으로 for, value 값 출력
		for(Integer key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		
		/* key,value값을 String타입으로 설정했을 경우
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("당번", "지각생");
		
		System.out.println(map2.get("당번"));
		*/
	}
}
