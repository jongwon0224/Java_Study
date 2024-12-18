package study.cls.cls08;
import study.cls.cls07.Temp;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassListMain {

	public static void main(String[] args) {
		
		Temp t = new Temp();
		
		Temp[] arr = new Temp[3];
		arr[0] = new Temp();
		arr[1] = new Temp();
		arr[2] = t;
		
		
		// Integer는 int타입의 Wrapper 클래스
		// Double는 double타입의 Wrapper 클래스
		// list 생성 <데이터 타입>
		ArrayList<Temp>list = new ArrayList<Temp>();
		// list요소에 삽입
		list.add(t);	
		list.add(new Temp());
		list.add(new Temp());
		list.add(new Temp());
		list.add(new Temp());
		
		// temp의 print메소드 출력
		for(int i=0; i<list.size(); i++) {
			list.get(i).print();
		}
		
		System.out.println("----------");
		
		// 향상된 for문
		for(Temp item : list) {
			item.print();
		}
		
		// 밑에 methodList메서드 returnList로 받음
		ArrayList<Temp> returnList= methodList(list);
		System.out.println("method 호출 후");
		
		// 향상된 for문으로 출력
		for(Temp item : returnList) {
			item.print();
		}
	}
	
	// methodList메서드 -> public static은 메인 클래스여서 사용 + ArrayList<Temp>는 데이터 타입 (ex. String,int)
	// methodList(ArrayList<Temp>List) => 괄호안에 매개변수로 ArrayList<Temp>list 줌
	public static ArrayList<Temp> methodList(ArrayList<Temp>list) {
		System.out.println("method 안에서");
		list.add(new Temp());
		list.get(1).print();
		
		return list;
	}
	

}
