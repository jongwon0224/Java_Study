package study.db.sample.quiz03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz03 {
	
	
	public static void main(String[] args) throws IOException, ParseException {
		
		String str = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}"
				;
		
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj = (JSONObject)jsonParser.parse(str);
		
		JSONArray employees = (JSONArray)jsonObj.get("employees");
		
		for(int i=0; i<employees.size(); i++) {
			JSONObject employee = (JSONObject)employees.get(i);
			
			System.out.println(employee.get("id") + "," + employee.get("name") + "," + employee.get("position")+ "," + employee.get("salary"));
			
			JSONArray skills = (JSONArray)employee.get("skills");
			for(int j=0; j<skills.size(); j++) {
				System.out.println(skills.get(j));
			}
		}
		
		JSONObject company = (JSONObject)jsonObj.get("company");
		
		System.out.println(company.get("name") + "," +company.get("address") + "," +company.get("established"));
		
		JSONArray depts = (JSONArray)company.get("departments");
		for(int i=0; i<depts.size(); i++) {
			JSONObject dept = (JSONObject)depts.get(i);
			System.out.println(dept.get("name"));
			
			JSONArray emps = (JSONArray)dept.get("employees");
			for(int j=0; j<emps.size(); j++) {
				System.out.print(emps.get(j) + ",");
			}
			System.out.println();
		}
		
		JSONArray projects = (JSONArray)jsonObj.get("projects");
		
		for(int i=0; i<projects.size(); i++) {
			JSONObject project = (JSONObject)projects.get(i);
			
			System.out.println(project.get("title"));
			System.out.println(project.get("budget"));
			
			JSONArray team = (JSONArray)project.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.print(team.get(j) + ",");
			}
			System.out.println();
		}
		

		
		/*
		
		for (Object empObj : employees) {
			JSONObject emp = (JSONObject)empObj;
			String name = (String)emp.get("name");
			String position = (String)emp.get("position");
			Long salary = (Long)emp.get("salary");
			
			JSONArray skillsArray = (JSONArray) emp.get("skills");
			StringBuilder skills = new StringBuilder();
			for (Object skill : skillsArray) {
				if (skills.length() > 0) {
					skills.append(", ");
				}
				skills.append((String) skill);
			}
			
			quiz03List.add(name+","+position+","+salary+","+skills);
			
		}
		
		JSONObject company = (JSONObject)jsonObj.get("company");
		
		String name = (String)company.get("name");
		String address = (String)company.get("address");
		String established = (String)company.get("established");
		
		quiz03List.add(name + "," + address + "," + established);
		
		
		JSONArray projects = (JSONArray)jsonObj.get("projects");
		
		for(Object projectObj : projects) {
			JSONObject pj = (JSONObject)projectObj;
			String title = (String) pj.get("title");
			long budget = (long) pj.get("budget");
			
			quiz03List.add(title + "," + budget);
		}
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return quiz03List;	
	*/
}

}
