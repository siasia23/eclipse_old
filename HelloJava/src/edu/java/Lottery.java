package edu.java;

import java.util.Collections;

public class Lottery { // 로또기계. 중복되지 않은 7개 번호 배열 생성.
		
		LottoBall[] lottoBalls; // LottoBall 타입의 배열을 가진 변수 lottoBalls
		
		Lottery() { 
			// 기본생성자
		}
		
		Lottery(LottoBall[] lottoBalls) {
			this.lottoBalls = lottoBalls;
		}
		
		// 로또볼을 섞는 메소드
		LottoBall[] shuffle() {
			// 로직 구현
//			int shuffle = (int) (Math.random()*45) + 1;
			Shuffle
			return shuffle;
		}
		
		// 로또볼을 하나씩 추출하는 메소드
		LottoBall getLottoBall() {
			// 로직 구현
			lottoBalls = 
			return null;
		}
		
		// 중복된 숫자를 제거하는 메소드
		// 중복되면 true, 아니면 false return
		boolean isDuplicate(LottoBall lottoBall) {
			// 로직 구현
			return false;
		}
		
}
		
//		int i;
//		int[] LottoBall = new int[7];
//	
//		for(i=0; i<7; i++) {
//		
//			LottoBall[i] = (int) (Math.random()*45) + 1;
//			
//			for(int j=0; j<i; j++) {
//				
//				if(LottoBall[i] == LottoBall[j]) {
//					j--; 
//					break;
//				}
//				
//			} // for j
//
//		System.out.println(LottoBall[i]);;
//		
//		} // for i
//		
//	}
