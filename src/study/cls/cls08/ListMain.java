package study.cls.cls08;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMain {

	public static void main(String[] args) {
		
		// list 공부
		
		String [] arr = new String[4];
		String [] alphaArr = {"A","B","C","D"};
		
		
		for (int i=0; i< alphaArr.length; i++) {
			arr[i] = alphaArr[i];
		}
		
		System.out.println(Arrays.toString(arr)); // [A,B,C,D]


		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr[2] = null;
		
		for(String item : arr) {
			System.out.print(item + " ");
		}
		System.out.println(); // A,B,null,D
		
		// 배열은 인덱스 요소 삭제 불가능 -> null로 바뀜
// =================================================================================
		// 데이터 동적으로 변경위해 list사용
		
		// 이름이 list인 리스트 생성
		// list.add() == JS push함수같은 느낌
		// list.set() == 인덱스 요소 값 바꿔줌 (추가 X, 변경만)
		ArrayList<String> list = new ArrayList<String>();
		list.add("ㄱ"); // [ㄱ]
		list.add("ㄴ"); // [ㄱ, ㄴ]
		list.add("ㄷ"); // [ㄱ, ㄴ, ㄷ]
		list.add(0, "ㄹ"); // // [ㄹ, ㄱ, ㄴ, ㄷ]
		
		// list.size === arr.length
		// list.get(i) === arr[i]
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " "); // ㄹ ㄱ ㄴ ㄷ
		}
		System.out.println();
		
		//list.remove() = 괄호안 숫자 인덱스 값을 지워버림
		list.remove(2);
		
		for(String item : list) {
			System.out.print(item + " "); // ㄹ ㄱ ㄷ
		}
		System.out.println();
		
		
	}

}
