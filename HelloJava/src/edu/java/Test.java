package edu.java;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());

		long before=System.currentTimeMillis();
		int sum=0;
		for(int i=1; i<=1000000000; i++) {
			sum+=i;
		}
		
		long after=System.currentTimeMillis();
		
		System.out.println(after-before);
	}
}
