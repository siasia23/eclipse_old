package edu.java.exception;

public class AgeUnder19Main {

	public static void main(String[] args) {

		int age=15;
		int old=80;
		
		if(age<19) {
			try {
				throw new AgeUnder19Exception();
				// throw : 강제로 exception을 발생시킴
				// throws : exception 처리를 super에게 던짐
			} catch(AgeUnder19Exception ae) {
				System.out.println(ae.toString()); // .toString() 꼭 써야하나? 안 써도 실행 되는데?
			}
		}
		
		// else if로 붙여넣어도 됨
		if(old>=50) {
			try {
				throw new AgeOver50Exception();
			} catch(AgeOver50Exception ao) {
				System.out.println(ao);
			}
		}
	}
	

}
