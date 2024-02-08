import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Gson 라이브러리를 가져옴
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GSONTest {

	public static void main(String[] args) {
		
		// Gson 객체 생성
		Gson gson = new Gson();
		
		// Map을 하나 만들어보자
		Map<String, String> inputMap = new HashMap<String, String>();
		
		inputMap.put("name", "짱구");
		inputMap.put("age", "5");
		inputMap.put("address", "떡잎마을");
		
		// Map 객체를 JSON 문자열로 변환해서 네트워크로 보냄 (직렬화)
		String jsonStr = gson.toJson(inputMap);
		System.out.println(jsonStr);
		
		// JSON 문자열을 받아서 Map 객체로 변환해서 (역직렬화) Map의 메소드를 사용
		Map jsonMap = gson.fromJson(jsonStr, Map.class);	// Map.class : 맵 클래스의 코드
		System.out.println(jsonMap.get("address"));
		
		// List를 하나 만들어보자
		List<String> strList = new ArrayList<String>();
		
		strList.add("응");
		strList.add("진정");
		strList.add("휴");
		
		// List 객체를 JSON 문자열로 직렬화
		String str = gson.toJson(strList);
		System.out.println(str);
		
		// JSON 문자열을 List 객체로 역직렬화
		List list = gson.fromJson(str, List.class);
		System.out.println(list.get(1));
		
		// Person 객체를 JSON 문자열로 직렬화
		Person person1 = new Person("짱구", new Integer(5), "떡잎마을");
		String strPerson1 = gson.toJson(person1);
		System.out.println(strPerson1);
		
		// JSON 문자열을 Person 객체로 역직렬화
		Person person2 = gson.fromJson(strPerson1, Person.class);
		System.out.println(person2);
		
		// 실습1. List에 Person 3명 담고 직렬화
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("맹구", new Integer(5), "떡잎마을"));
		personList.add(new Person("훈이", new Integer(5), "떡잎마을"));
		personList.add(new Person("철수", new Integer(5), "떡잎마을"));
		
		String strPersons = gson.toJson(personList);
		System.out.println(strPersons);
		
		// 역직렬화해서 찍어보자
		System.out.println(gson.fromJson(strPersons, List.class));
		 
		// 맵으로 해보자
		Map<String, Object> personMap = new HashMap<String, Object>();
		personMap.put("person1", new Person("맹구", 5, "떡잎마을"));
		personMap.put("person2", new Person("훈이", 5, "떡잎마을"));
		personMap.put("person3", new Person("짱구", 5, "떡잎마을"));
		
		// 직렬화
		String strPersonMap = gson.toJson(personMap);
		System.out.println(strPersonMap);
		
		//역직렬화
		Map personMap2 = gson.fromJson(strPersonMap, Map.class);
		System.out.println(personMap2.get("person3"));
		
		// GSON의 JsonObject
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "짱구");
		jsonObject.addProperty("age", 5);
		jsonObject.addProperty("married", false);
		
		System.out.println(jsonObject);
		
		System.out.println(jsonObject.get("name").getAsString());
		System.out.println(jsonObject.get("age").getAsInt());
		System.out.println(jsonObject.get("married").getAsBoolean()); 
		
		// GSON pretty printing : 예쁘게 찍어내자 
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
		String prettyStr = gson2.toJson(jsonObject);
		System.out.println(prettyStr);
		
	}
	
}
