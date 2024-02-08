package edu.java;

// 1부터 45까지의 임의의 정수 중 3개를 출력
public class Exam3 {
	
	public static void main(String[] args) {
		
		for(int count=1; count<4; count++) {
			
			int i = (int) (Math.random() * 45) + 1;
			System.out.println(i);
		
		}
		
	}

}
