package study.practice.quiz16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MaratonMain {

	public static void main(String[] args) {
		
		String [] participant = {"leo","kiki","eden"}; //참여선수
		String [] completion = {"eden","kiki"}; //완료선수

		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		// 1번 -> 값 모두 제거후 출력
		
//		List<String> partList = new ArrayList<String>(List.of(participant));
//		List<String> compList = new ArrayList<String>(List.of(completion));
		
//		partList.removeAll(compList);
//		return partList.get(0).toString();
		
		
		// 2번 -> 값 하나씩 제거후 출력
//		for(String s : compList) {
//			partList.remove(s);
//		}
//				
//		return partList.get(0);
		
		
		// HashSet 사용
//		Set<String> compSet = new HashSet <String>();
//		
//		// 완주자목록
//		for(String s : completion) {
//			compSet.add(s);
//		}
//		// 참가자를 compSet에 있는지 확인 후 있으면 삭제 -> 없으면 return
//		for(String s : participant) {
//			
//			if(compSet.contains(s)) {
//				compSet.remove(s);
//			} else {
//				return s;
//			}
//		}
//		return null;
		
		//getOrDefault로 if else문 대체 가능
		//pMap.getOrDefault(s, 0) => s값(키값)이 있다면 밸류값을 0 반환 -> +1로 인해 밸류값 1로 변경
		// 동명이인일 경우 -> 키값이 있기때문에 1반환 -> +1로 인해 밸류값 2로 변경
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		
		for(String s : participant) {
			
			pMap.put(s, pMap.getOrDefault(s, 0)+1);
			
//			if(pMap.containsKey(s)) { // true일경우 이미 키값이 있다
//				pMap.put(s, pMap.get(s)+1); // 키값이 있으면 밸류값 +1;
//			} else {
//				pMap.put(s, 1);
//			}
		}
		
		for(String s : completion) {
			pMap.put(s, pMap.get(s)-1); // participant와 completion에 동일한 키값이 있으면 -1;
		}
		
		for(String key : pMap.keySet()) {
			if(pMap.get(key) == 1) { // 미완주자 -> 완주자들은 밸류값 0임
				return key;
			}
		}
		return null;

		
	}
	
	
}