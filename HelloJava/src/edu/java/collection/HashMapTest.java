package edu.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("사탕", 13);
		map.put("솜사탕", 5000);
		map.put("배고파", 1250);
		map.put("추워", -5);
		
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) { // it에 다음 번 반복할 애가 있으면,
			String nextItem=(String) it.next(); // it의 다음 번 애는 String 타입의 변수명 nextItem으로 하겠다.
			System.out.println(nextItem);
		}
		
		Map<String, String> sMap=new HashMap<String, String>();
		
	}

}
