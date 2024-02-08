package singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	// 조건 1. private
	// 조건 2. static
	// 조건 3. Singleton 타입
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		// static 변수를 사용하기 위해 메소드도 static으로 함
		// getInstance 메소드를 본다면, 싱글톤 패턴이 사용됐음을 알 수 있음
		return singleton;
	}
	
}
