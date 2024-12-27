package study.practice.prac25;

import java.util.ArrayList;
import java.util.List;

public class MarineMain {

	public static void main(String[] args) {
		
		Unit u1 = new Marine();
		Unit u2 = new Tank();
		Dropship u3 = new Dropship();
		
		u1.move(3, 3);
		u2.move(5, 5);
		u3.move(10,10);
		
		//형변환 예시
//		Marine mm = (Marine) u1;
		
		u1.stop();
		((Marine)u1).stimPack();
		
		((Tank)u2).changeMode();
		
		u3.load();
		u3.unload();
		
		/*
		// 한번에 다른 유닛들 배열/리스트에 넣어서 동적으로 변경가능
		List <Unit> unitList = new ArrayList <> (); // 리스트로 관리
		unitList.add(u1);
		unitList.add(u2);
		unitList.add(u3);
		
		for (Unit item : unitList) {
			item.stop();
		}
		*/
		/*
		Unit[] bd1 = {u1,u2,u3}; // 배열로 관리
		((Marine)bd1[0]).stimPack();
		// 이런식으로 배열에서 형변환
		//		Marine mm = (Marine)bd1[0];
		
		for(int i=0; i<bd1.length; i++) {
			((Marine)bd1[i]).stimPack();
		}
		*/
	}

}
