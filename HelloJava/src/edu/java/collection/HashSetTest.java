package edu.java.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<Integer> set=new HashSet<Integer>();
		
		int lottoNum =(int) (Math.random()*45) +1;
		
		for(int i=0; i<7; i++) {
		
			set.add(lottoNum);
			System.out.println(lottoNum);
			
		} // for
		
	}

}
