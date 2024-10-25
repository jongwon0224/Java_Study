package study.practice;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brand = "로지텍";
		String product = "mx kyes";
		int price = 135000;
		String serialNum = "3332L1545K";
		
		
		
		String manufacturer = "SAMSUNG";
		int monitInch = 24;
		String monitColor = "black";
		boolean HDMI = true;
		boolean sound = false;

		
		double pi = 3.14;
		System.out.println("원주율 : " + pi);
		
		
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int newMathScore = Integer.parseInt(mathScore);
		int newEnglishScore = Integer.parseInt(englishScore);
		int newArtScore = Integer.parseInt(artScore);
		int totalScore = newMathScore + newEnglishScore + newArtScore;
		
		
		System.out.println("총점 : " + totalScore);
		

		int num1 = 4;
		int num2 = 10;
		double num3 = (double)num1 / num2;
//		double num3 = num1 / (double)num2;
//		double num3 = (double)num1 / (double)num2;
		System.out.println(num3);
		
		
		
	}

}
