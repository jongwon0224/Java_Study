package study.var;

public class variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열을 다른 형태로 변환 하는 방법
		
		//1. 문자형을 숫자로 바꿀때 => Byte.parseByte(변수명);
		String str = "10";
		byte value = Byte.parseByte(str);
		
		//2. 문자형을 숫자로 바꿀때 => int로바꾸면 Integer.parseInt(변수명);
		String s1 = "1231";
		int n1 = 50;
		int n2 = Integer.parseInt(s1); 
		System.out.println(n1+n2); //1281
		System.out.println(n1+ Integer.parseInt(s1)); //1281 이런식으로도 가능;
	
		//3. 문자형을 실수로 변환
		String s2 = "13.13";	
		double n3 = Double.parseDouble(s2);
		System.out.println(n3);
		
		//4. 문자형을 불린타입으로 변환
		String s5 = "false";  
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(s5);
		
		//다른 형태를 문자열로 변환 => String.valueOf(변수명); or 여러 타입 + ""; ex)15 + ""; 하면 문자열로 변환
		
		String s10 = String.valueOf(b2); //불린타입을 문자열로
		String s11 = String.valueOf(n3); //실수를 문자열로
		String s12 = String.valueOf(n2); //정수를 문자열로
		String s13 = 10 + ""; //정수를 문자열로 변환하는 꼼수(?)
		//String 변수명 = 타입 + ""; 하면 다 문자열로 변환되는 듯..
	
		System.out.println(s10);
//		System.out.println(s10);



	}

}
