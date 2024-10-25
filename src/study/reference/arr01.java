package study.reference;

public class Arr01 {

	public static void main(String[] args) {
		//배열
/*	
		int [] scoreArr = {100,90,80,70,60};
		int sum1 = 0;
		int total = scoreArr[0]+scoreArr[1]+scoreArr[2]
						+scoreArr[3]+scoreArr[4]+scoreArr[5];
		
		for(int i=0; i<scoreArr.length; i++) {
			sum1 += scoreArr[i];
			System.out.println(sum1);
		}
		System.out.println(sum1 / scoreArr.length);
*/	
	
		//변수는 선언시 초기화까지 한번에 해야됨
		int [] pointArr = null;
		//pointArr = {1,2,3,4,5}; 불가능
		
		//new생성자 활용해서 값을 넣을 수 있음.
//		pointArr = new int [] {1,2,3,4,5};
		
		// 인덱스 개수 선언 후 하나씩 지정 가능.
		pointArr = new int[5];
//		pointArr[0] = 1;
//		pointArr[1] = 2;
//		pointArr[2] = 3;
//		pointArr[3] = 4;
//		pointArr[4] = 5;
		
		//for문을 활용해서 배열 값 지정 가능
		for(int i=0; i<5; i++) {
			pointArr[i] = i+1;
		}
		
		// 배열값 출력시 다시 for문 사용..
		for(int i=0; i<5; i++) {
			System.out.print(pointArr[i]+" ");
		}
		System.out.println("=================================================\n");
		
		int[] intArr = new int[5];
		double [] doubleArr = new double[10];
		String[] strArr = new String[30];
		boolean[] boolArr = new boolean[4];
		
		
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+ " ");
		}
		System.out.println(); // 0
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i]+ " ");
		}
		System.out.println();// 0.0
	
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+ " ");
		}
		System.out.println();// null
		
		for(int i=0; i<boolArr.length; i++) {
			System.out.print(boolArr[i]+ " ");
		}
		System.out.println();// false
		

		
		
		
	}
	
}
