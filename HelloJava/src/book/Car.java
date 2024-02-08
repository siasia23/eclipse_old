package book;

public class Car {

	Tire frontLeft=new Tire("앞왼", 6);			// 타이어 번호 1
	Tire frontRight=new Tire("앞오른", 2);		// 타이어 번호 2
	Tire backLeft=new Tire("뒤왼", 3);			// 타이어 번호 3
	Tire backRight=new Tire("뒤오른", 4);		// 타이어 번호 4
	
	int run() {
		
		System.out.println("자동차 달림!");
		
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		
		return 0; // 기본 리턴 값
		
	} // run
	
	void stop() {
		System.out.println("자동차 멈춤!");
	}
	
} // class
