package study.practice.prac18;
import java.util.ArrayList;

public class Menu {

	// 필드
	String name;
	int price;
	
	ArrayList<String>menuList = new ArrayList<String>();
	
	
	// 생성자
	public Menu(String str, int i) {
	name = str;
	price = i;
	}
	
	// MenuList setter
	public void setMenuList(ArrayList<String>menuList) {
		this.menuList = menuList;
	}
	
	
}
