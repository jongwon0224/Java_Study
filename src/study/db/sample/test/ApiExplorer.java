package study.db.sample.test;

import java.io.IOException;
import java.util.List;

public class ApiExplorer {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(ApisApiService.forecastWeather("20250106"));
		
		List<ApisInfo> apisList = null;
		
		
		try {
			apisList = ApisApiService.forecastWeatherInfoList("2025-01-06");
			
			for(ApisInfo info : apisList) {
				System.out.println(info.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ApisDAO apisDAO = new ApisDAO();
		
		int count = 0;
		for(ApisInfo ai : apisList) {
			count += apisDAO.saveApisInfo(ai);
		}
		System.out.println(count + "개 저장성공");
	}
	
}
