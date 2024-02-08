package edu.java.anonymous;

public class SoundableMain {

	public static void main(String[] args) {
		
		// 객체 생성
		//Dog dog=new Dog(); 틀림
		Soundable dog=new Dog("개"); // 최상위타입으로 받아야함
		Soundable cat=new Cat("고양");
		
		// printSound 메소드 호출
		printSound(new Dog("개","멍")); // 익명객체
		printSound(new Cat("고양이","옹")); // 익명객체
		
	} // main method
	
	// printSound 메소드 선언
	public static void printSound(Soundable soundable) {
	// 메소드 printSound의 인자가 Soundable 타입의 파라미터 soundable
		
//		Soundable s=new Soundable( ) {
//			
//			public String name() {
//				if(soundable instanceof Dog) {
//					return ((Dog)soundable).name();
//					}
//				else if(soundable instanceof Cat) {
//					return ((Cat)soundable).name();
//				}
//				else return "";
//			}
//			
//			public String sound() {
//				if(soundable instanceof Dog) return "멍";
//				else if(soundable instanceof Cat) return "옹";
//				else return "";
//			}
			
//		};
		
//		soundable.name();
		
//		Soundable name=new Soundable() {
//			public String name() {
//				"개";
//			}
//		};
		
		System.out.println(
			soundable.name()+"는 "+soundable.sound()+" 소리냄"
		);
		
	} // printSound method
	
} // class
