package edu.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student("stu001","학생1",100,90,80);
//		s1.setKor(10); // 값 변경할 때 setter
		
		Student s2=new Student("stu002","학생2",50,80,75);
		
		
		// 1. 두 학생의 데이터를 Collection으로 만들어서 국어점수 평균, 영어 평균, 수학 평균을 출력하라.
		Map<String, Student> studentPool=new HashMap<String, Student>();
		
		studentPool.put(s1.getSno(), s1);
		studentPool.put(s2.getSno(), s2);
		
		List<Integer> al=new ArrayList<Integer>(); // ArrayList는 배열이 아님. index 값은 가짐.
		al.add(0);
		al.add(0);
		al.add(0);
		
		Iterator it = studentPool.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Student> entry = (Map.Entry<String, Student>) it.next();
			Student student = (Student) entry.getValue();
			al.set(0, al.get(0)+student.getKor());  
			al.set(1, al.get(1)+student.getEng());
			al.set(2, al.get(2)+student.getMath());
		
		} // while
		
		for(Integer in:al) {
			System.out.println(in/studentPool.size());
		}
		
		
		
		
		
/*		
		int averageKor = (s1.getKor()+s2.getKor()) / studentPool.size();
		int averageEng = (s1.getEng()+s2.getEng()) / studentPool.size();
		int averageMath = (s1.getMath()+s2.getMath()) / studentPool.size();
		
		System.out.println(averageKor);
		System.out.println(averageEng);
*/		

		
/*		
		studentPool.put("stu001", 100);
		studentPool.put("stu001", 90);
		studentPool.put("stu001", 80);
		
		studentPool.put("stu002", 50);
		studentPool.put("stu002", 80);
		studentPool.put("stu002", 75);
*/		

		
		
		
	}
	
}
