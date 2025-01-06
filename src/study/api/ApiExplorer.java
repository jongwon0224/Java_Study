package study.api;

import java.io.IOException;
import java.util.List;

public class ApiExplorer {
	
	public static void main(String[] args)  {
		
		List<ArplInfo> arplList = null;
		
		try {
			arplList = ArplApiService.forecastDustArplInfoList("2024-12-15");
			
			// json -> 자바 ArplInfo객체로 변환 완료
			for(ArplInfo info : arplList) {
				System.out.println(info.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
/*		
		//ArplInfo 객체 -> db저장
		//ArplDAO

		// pk값 기준 NVL쿼리문 사용해서 데이터 추가
		ArplDAO arplDAO = new ArplDAO();
		int result = arplDAO.saveArplInfo(arplList.get(0));
		if(result > 0) {
			System.out.println("저장잘됨");
		}
		arplDAO.saveArpl();
*/		
		// 시퀀스 사용해서 데이터 추가
		ArplDAO arplDAO = new ArplDAO();
		
		int count = 0;
		for(ArplInfo ai : arplList) {
			count += arplDAO.saveArplInfo(ai);
		}
		System.out.println(count + "개 저장성공");
	}
}