package edu.java.exception;

// 사용자 정의 예외
// api에 없는 예외. 사용자가 만드는 예외. Exception 클래스를 상속받아 생성.
// 시스템적인 예외가 아닌 논리적인 예외
public class AgeUnder19Exception extends Exception {

	@Override
	public String toString() {
		return "19세 미만 관람불가";
	}

}
