package study.inherit.inherit04.v3;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		
		Cleaner c1 = new Cleaner();
		
//		c1.removeDust();
//		DustCleaner dc = new DustCleaner();
//		dc.removeDust();
		
		
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
//		Cleaner [] c5 = {new Cleaner(), new DustCleaner(), new WindowCleaner(), new FloorCleaner()};
		
		List <Cleaner> List = new ArrayList <Cleaner>();
	
		List.add(new DustCleaner());
		List.add(new DustCleaner());
		List.add(new DustCleaner());
		
		List.add(new WindowCleaner());
		List.add(new WindowCleaner());
		List.add(new WindowCleaner());
		
		List.add(new FloorCleaner());
		List.add(new FloorCleaner());
		List.add(new FloorCleaner());
		
//		List.get(0).removeDust();
		
		for(Cleaner c : List) {
			c.doClean();
			
			if (c instanceof DustCleaner ) {
				DustClenaer d = (DustCleaner)c;
				d.arrangeItem();
			}
		}
		
		Cleaner cc4 = new DustCleaner();
		cc4.doClean();
		DustCleaner d1 = (DustCleaner)c1;
		d1.doClean();
		d1.arrangeItem();
		
		
		/*
		DustCleaner [] dustArr = new DustCleaner [3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
		List <WindowCleaner> windowList = new ArrayList <WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		List <FloorCleaner> floorList = new ArrayList <FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		
		for(int i=0; i<dustArr.length; i++)
			dustArr[i].removeDust();
		
		
		for (int i=0; i<windowList.size(); i++)
			windowList.get(i).washWindow();
		
		
		for(FloorCleaner fc : floorList) {
			fc.cleanFloor();
		}
		
		*/
	}

}
