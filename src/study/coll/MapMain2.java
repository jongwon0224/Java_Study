package study.coll;
import java.util.*;

public class MapMain2 {

	public static void main(String[] args) {
		
		Map<String, Score> map = new HashMap<String, Score>();
		
		Score s1 = new Score(70,60,80);
		// value값 score객체에 setter사용해서 입력
		s1.setMath(100);
		s1.setEng(50);
		s1.setLang(80);
		
		map.put("김하나", s1);
		map.put("정둘", new Score(80,60,40));
		System.out.println(map); // {김하나=Score [math=100, eng=50, lang=80], 정둘=Score [math=80, eng=60, lang=40]}
		System.out.println(map.get("정둘")); // Score [math=80, eng=60, lang=40]
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key).getMath()); // 100, 80
			System.out.println(map.get("김하나").getEng());
			System.out.println(key);
		}
		
//		for (String key : map.keySet()) {
//			System.out.println(key + " : " + map.get(key));
//		}
	}

}

class Score {
	
	int math;
	int eng;
	int lang;
	
	public Score(int math, int eng, int lang) {
		super();
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Score [math=" + math + ", eng=" + eng + ", lang=" + lang + "]";
	}
	
	
	
}
