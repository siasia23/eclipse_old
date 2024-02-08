package edu.java;

// 1부터 1000까지의 정수 중에서 홀수들의 합을 출력
public class Exam2 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=1000; i++) {

			if(i%2 != 0) {
				
				sum =+ i;
			}
		}
		System.out.println(sum);
	}
}
