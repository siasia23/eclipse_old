package book; // 260p

public class Calculator {

	// 반환타입 없음 = void
	void powerOn() {
		System.out.println("Power On!");
	}
	
	// 반환타입 int, 메소드명 plus
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	
	void execute() {
		double result=avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	void powerOff() {
		System.out.println("Power Off!");
	}
}
