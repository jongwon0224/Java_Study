package study.db.sample.test;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.BufferedReader;
import java.io.IOException;

public class ApisApiService {
	
	public static String forecastWeather(String date) throws IOException {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
		urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(date, "UTF-8")); /*‘21년 6월 28일발표*/
		urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /*05시 발표*/
		urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
		urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
		
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		String result = sb.toString();
		System.out.println(sb.toString());
		
		return result;
	}
	
	

	public static List<ApisInfo>forecastWeatherInfoList(String date) throws IOException {
		
		List<ApisInfo> apisList = new ArrayList<ApisInfo>();
		
		try {
			String jsonText = forecastWeather(date);
						
			System.out.println("******요청 결과 텍스트******");
			System.out.println(jsonText);
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonText);
			JSONObject response = (JSONObject)jsonObj.get("response");
			
			JSONObject header = (JSONObject) response.get("header");
			System.out.println(header.get("resultMSG"));
			System.out.println(header.get("resultCode"));
			
			JSONObject body = (JSONObject)response.get("body");
			System.out.println(body.get("dataType"));
			
			JSONArray items = (JSONArray)body.get("items");
			
			for(int i=0; i<items.size(); i++) {
				JSONObject itmes = (JSONObject)items.get(i);

				JSONArray itemArray = (JSONArray)items.get("itemArray");
			
			for(int j=0; j<itemArray.size(); j++) {
				JSONObject item = (JSONObject)itemArray.get(j);
				System.out.println(">>>index:" + i);
				System.out.println(item.get("baseDate"));
				System.out.println(item.get("fcstDate"));
				System.out.println(item.get("fcstTime"));
				System.out.println(item.get("fcstValue"));
				
			}
				ApisInfo ai = new ApisInfo();
				
				ai.setBaseDate(convertValueToString(item.get("baseDate")));
			    ai.setFcstDate(convertValueToString(item.get("fcstDate")));
			    ai.setFcstTime(convertValueToString(item.get("fcstTime")));
			    ai.setFcstValue(convertValueToString(item.get("fcstValue")));
				
				apisList.add(ai);
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return null;
		
	}

	private static String convertValueToString(Object obj) {
		return obj == null ? "" : obj.toString();
	}	
}
