package singleton;

public class SingletonMain {

	public static void main(String[] args) {

		Singleton st1=Singleton.getInstance();
		Singleton st2=Singleton.getInstance();
		
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println(st1==st2 ? "같은 객체" : "다른 객체");
		// 삼항연산자
		// st1과 st2가 같으면 "같은 객체"를 출력하고, 그렇지 않으면 "다른 객체"를 출력하라
		
	}

}
