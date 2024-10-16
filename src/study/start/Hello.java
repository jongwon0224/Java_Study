package study.start;

public class Hello {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int는 정수형 숫자를 담는 변수
		//한줄로 변수 입력 가능(콤마)
		//변수는 숫자먼저사용 불가. 언더바 및 달러, 영문으로 만들어야됨
		//변수는 영어대소문자도 구분이됨 ex) name <==> Name하고 다른변수
		
		int x,y,z;// 다중변수 선언은 x,y,z / 초기화시는 x=1,y=2,z=3; 이런식으로
//		int x=10, y=20, z=30;
//		System.out.println(x+y+z);
 
		
		int point = 50; //변수 선언 + 값 저장 = 초기화
		point = 90; //재변수 설정
		System.out.println(point); //변수 50으로 선언해도 나중에 값변경하면 그 값출력;
		

		//value = 10; int 변수값 지정전에 선언하면 안됨
		int time = 16;
		System.out.println(time);
//		int time; 위 변수 선언이랑 동일한듯
//		time = 16;
		

		int minute = time + 9; //변수내 변수사용 가능
		System.out.println(minute);	//16+9
		
		
//		int myFloor = floor + 7; 값이 없는 변수를 계산할수없음(floor 변수 초기화 안함)
		int score = 10;
		int totalScore = point*4 + score + score + score;
		System.out.println(totalScore); //변수 계속 사용 가능;
		System.out.println(totalScore + point); // 390 + 90 = 480
		
		totalScore = totalScore + point; // 390 + 90 = 480 
		System.out.println(totalScore);
		
		
		x = 10;
		y = x;
		z = x + y;
		System.out.println(z);
		
		int a=10, b=20; 
		// a=b;
		// b=a; 서로 값 바꾸지 못함
		
		int c = a; //변수에 서로 다른 값 바꿀때 새로운 변수 하나 생성해서 처리함 
		a = b;
		b = c;
		System.out.println(a +""+ b);
		
		
		
//		문자열 변수 지정시 => String var 로 ..int는 정수만
		String name = "hwang";
		String name2 = "jongwon";
		System.out.println(name+name2); //
		
	}

}
