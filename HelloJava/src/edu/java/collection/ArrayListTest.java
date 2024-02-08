package edu.java.collection;

// ctrl + shift + o : 필요한 기능을 자동으로 import 하는 단축키
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		
		al.add("사과"); // index 0
		al.add("구름"); // index 1
		al.add("문자열"); // index 2
		
		int size=al.size();
		System.out.println(size);
		
		String second=al.get(1);
		System.out.println(second);
		
		al.remove(2);
		System.out.println(al);
		
		al.remove("사과");
		System.out.println(al);
		
		al.add("보라");
		System.out.println(al);
		
		int alSize=al.size();
		for(int i=0; i<alSize; i++) {
			String str=al.get(i);
			System.out.println(i+str);
			
			
		List<Integer> lotto=new ArrayList<Integer>();
		int lottoNumber = (int) Math.random()*45 +1;
		  
		
		
		
		}
		
	}
	
}
