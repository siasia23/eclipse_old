package edu.java;

// 별찍기 피라미드
public class Exam6 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {//01234

			for(int j=0; j<4-i; j++) {//0

				System.out.print("-");

			}
			for(int j=0; j<i+1; j++) {
			
				System.out.print("*");
				
			}

			System.out.println();
		}
	}
}