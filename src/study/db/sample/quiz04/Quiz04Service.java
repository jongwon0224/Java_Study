package study.db.sample.quiz04;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import study.db.sample.test.ApisInfo;

public class Quiz04Service {
	
	// 외부에 누구 고객의 주문정보 조회
	// 오늘날짜 주문정보 조회
	
	
	// 응답받은 데이터로 가정
	public static String orderInfo() throws ParseException {
		
		
		String str = "{\n" +
				"    \"id\": 1,\n" +
				"    \"name\": \"John Doe\",\n" +
				"    \"contacts\": [\n" +
				"        {\n" +
				"            \"type\": \"email\",\n" +
				"            \"value\": \"john.doe@example.com\"\n" +
				"        },\n" +
				"        {\n" +
				"            \"type\": \"phone\",\n" +
				"            \"value\": \"01023456789\"\n" +
				"        }\n" +
				"    ],\n" +
				"    \"address\": {\n" +
				"        \"street\": \"123 Main Street\",\n" +
				"        \"city\": \"Seoul\",\n" +
				"        \"zipcode\": \"12345\"\n" +
				"    },\n" +
				"    \"orders\": [\n" +
				"        {\n" +
				"            \"orderId\": \"ORD-001\",\n" +
				"            \"date\": \"2024-07-09\",\n" +
				"            \"items\": [\n" +
				"                {\n" +
				"                    \"id\": 1,\n" +
				"                    \"name\": \"Smartphone\",\n" +
				"                    \"quantity\": 2\n" +
				"                },\n" +
				"                {\n" +
				"                    \"id\": 2,\n" +
				"                    \"name\": \"Laptop\",\n" +
				"                    \"quantity\": 1\n" +
				"                }\n" +
				"            ]\n" +
				"        },\n" +
				"        {\n" +
				"            \"orderId\": \"ORD-002\",\n" +
				"            \"date\": \"2024-07-10\",\n" +
				"            \"items\": [\n" +
				"                {\n" +
				"                    \"id\": 3,\n" +
				"                    \"name\": \"Headphones\",\n" +
				"                    \"quantity\": 1\n" +
				"                }\n" +
				"            ]\n" +
				"        }\n" +
				"    ]\n" +
				"}";
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(str);
		
		JSONArray orders =(JSONArray)obj.get("orders");
		
		for(int i=0; i<orders.size(); i++) {
			JSONObject order = (JSONObject)orders.get(i);
			
			System.out.println(order.get("orderId"));
			
			JSONArray items = (JSONArray)order.get("items");
			
			for(int j=0; j<items.size(); j++) {
				JSONObject item = (JSONObject)items.get(j);
				
				System.out.println(item.get("id"));
				System.out.println(item.get("name"));
				System.out.println(item.get("quantity"));
			}
		}
		
		
		
		return str;
	}
}
