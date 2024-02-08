package edu.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompanyMain {

	public static void main(String[] args) {

		// 실습2. 회사 2개를 만들고, 회사 2개의 2022년 수익합계, 2023년 수익합계를 출력하라.
		// 예시 ) ABC 회사와 DEF 회사의 2022년 총수익은 ___ 이다.
		// 예시 ) ABC 회사와 DEF 회사의 2023년 총수익은 ___ 이다.

		Company c1=new Company("12345","샘성",110,97);
		Company c2=new Company("11111","애풀",126,31);
		
		Map<String, Company> comMap = new HashMap<String, Company>();
		
		comMap.put(c1.getSsn(), c1);
		comMap.put(c2.getSsn(), c2);
		
//		Set<String> keySet = comMap.keySet();
//		Iterator<String> it = keySet.iterator();
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(0, c1.getIncome2022());
		al.add(1, c2.getIncome2022());
		System.out.println(al);
		
		Integer sum = (Integer) ( al.get(0) + al.get(1) ) / al.size() ;		
		System.out.println(c1.getName()+"회사와 "+c2.getName()+"회사의 2022년 총수익은 "+sum+"이다.");
		
/*		
		while(it.hasNext()) {
			String key=it.next();
			Company value=comMap.get(key);
		} // while
*/
		
//		int sum = c1.getIncome2022() + c2.getIncome2022();
//		System.out.println(sum);
		
	} // main

} // class
