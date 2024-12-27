package study.exp;

public class Exp02 {

	public static void main(String[] args) {
		
		int [] arr = new int [3];
	
		// Exception e = e안에 모든 예외를 담을 수 있기 때문에 맨 앞에 사용 불가
		// 해결방안 -> Exception e를 맨 아래에 주면됨.
		
		try {
//			arr = null; NullPointerException출력됨
			arr[5] = 10; // ArrayIndexOutOfBoundsException 출력됨
		
		} catch (NullPointerException e) {
			System.out.println("NullPointerException catch block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch block");
		} catch (Exception e) {
			System.out.println("Exception catch block");
		} finally {
			System.out.println("다시 체크해봐");
		}
	}
}
