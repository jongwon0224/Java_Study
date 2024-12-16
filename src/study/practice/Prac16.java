package study.practice;

import java.util.Scanner;

public class Prac16 {

	public static void main(String[] args) {
		
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
		
		/*
		int [] classArr1 = new int[5];
		int [] classArr2 = new int[5];
		int [] classArr3 = new int[5];
		
		double class1Avg = 0;
		int total1 = 0;
		
		double class2Avg = 0;
		int total2 = 0;
		
		double class3Avg = 0;
		int total3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("1반 학생들 점수를 입력해주세요 : 5명");
		for(int i=0; i<classArr1.length; i++) {
			classArr1[i] = scanner.nextInt();			
			total1 += classArr1[i];
			class1Avg = total1 / (double)classArr1.length;
		}

		System.out.println("2반 학생들 점수를 입력해주세요 : 5명");			
		for(int i=0; i<classArr1.length; i++) {
			classArr2[i] = scanner.nextInt();
			total2 += classArr2[i];
			class2Avg = total2 / (double)classArr2.length;
		}
		
		System.out.println("3반 학생들 점수를 입력해주세요 : 5명");
		for(int i=0; i<classArr1.length; i++) {			
			classArr3[i] = scanner.nextInt();
			total3 += classArr3[i];
			class3Avg = total3 / (double)classArr3.length;
		}
	
		System.out.println("1반 평균 " + class1Avg);
		System.out.println("2반 평균 " + class2Avg);
		System.out.println("3반 평균 " + class3Avg);
	}
	*/
		
		//2차원 배열 사용
		int [][] points = new int[3][5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println( (i+1) + " 반 : ");
			for(int j=0; j<5; j++) {
				points[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0;
		int classTotal = 0;
		
		for(int i=0; i<3; i++) {
			classTotal = 0;
			
			for(int j=0; j<5; j++) {
				classTotal += points[i][j];				
			}
			
			total += classTotal;
			System.out.println( (i+1) + "반의 평균 : " + (classTotal/5.0));
		}
		System.out.println("전체 평균 : " + (total/15.0));
	
	}
}
	
	
