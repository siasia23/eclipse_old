package edu.java.collection;

import java.util.HashSet;
import java.util.Set;

public class LottoDupTest {

	public static void main(String[] args) {
		
		Object noDup7Num = noDup(); // noDup이라는 메소드 호출
		System.out.println(noDup7Num);
		
	} //main
	
	// 1~45 중에서 중복되지 않는 7개의 숫자를 리턴
	static Object noDup() {
		
		Set<Integer> lottoNumSet=new HashSet<Integer>();
		
		while(true) {
			Integer i = (int) (Math.random()*45)+1;
			lottoNumSet.add(i);
			if (lottoNumSet.size() == 7) break;
		} // while

		return lottoNumSet;
	
	} // noDup
	
} // class
