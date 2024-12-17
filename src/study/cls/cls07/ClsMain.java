package study.cls.cls07;

import java.util.Arrays;

public class ClsMain {

	public static void main(String[] args) {
		
		// 변수 복수개 관리하기 편하게 배열에 넣음
		int n = 10;
		int n2 = 20;
		int[] nArr = {10,20};
		int[] nArr2 = new int[5];
		nArr2[1] = 500; // nArr2에 요소 넣기
		
		int[] rArr = methodC(nArr);
		
		for(int i : rArr) {
			System.out.println(i);
		}
				
		
		// 변수 복수개 관리하기 편하게 배열에 넣음
		Temp t = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		Temp[] tArr = {t, t2, t3};
		Temp[] tArr2 = new Temp[5];
		tArr2[1] = new Temp(); //tArr배열에 Temp 넣기
	
		for(int i=0; i<tArr.length; i++) {
			tArr[i].print();
		}
		
		System.out.println("-----------------1");
		Temp [] dArr = methodD(tArr);
		for(Temp item : dArr) {
			item.print();
		}
		System.out.println("-----------------2");
		
	}
	
	public static int methodA(int n) {
		int r = n + 10;
		return r;
	}
	
	public static Temp methodB(Temp p) {
		Temp p2 = p;
		
		return new Temp();
	}
	
	public static int[] methodC(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");			
		}
		System.out.println();
		int[] arr2 = {20, 30, 50};
		return arr2;
	}
	
	public static Temp[] methodD(Temp[] arr) {
		
		for(Temp t : arr) {
			t.print();
		}
		
		Temp[] arr2 = new Temp[2]; // Temp 빈 배열 선언
		arr2[0] = new Temp(); // 인덱스 위치에 요소 삽입
		arr2[1] = new Temp(); // 인덱스 위치에 요소 삽입
		

		return arr2;
	}
	
}
