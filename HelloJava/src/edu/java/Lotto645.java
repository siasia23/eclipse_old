package edu.java;

public class Lotto645<Scanner> {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new scanner(system.in);
			
		int[] iArray = new int[7];
		
		for(int i=0; i<7; i++) {
		
			iArray[i] = (int) (Math.random()*45) + 1;
			
			for(int j=0; j<i; j++) {
				if (iArray[i] == iArray[j]) {
					i --;
					break;
				}
			}	
		} //for
		
		for (int i=0; i<7; i++) {
			System.out.println(iArray[i]);
		} // for

	} // main
} // class