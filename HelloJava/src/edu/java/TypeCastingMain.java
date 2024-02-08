package edu.java;

public class TypeCastingMain {

	public static void main(String[] args) {
		
		// Parent 타입의 parent1. 가지고 있는 참조는 Parent참조
		Parent parent1=new Parent();
		// Child 타입의 child1. 가지고 있는 참조는 Child참조
		Child child1=new Child();
		
		System.out.println(parent1.getName());
		System.out.println(child1.getName());
		
		// upcasting. 상위 형변환. 묵시적 형변환. 하위타입이 상위타입으로 변환
		// parent2라는 변수는 Parent 타입. 가지고 있는 참조는 Child참조
		Parent parent2=new Child();
		System.out.println(parent2.getName());
		
		// downcasting. 하위 형변환. 명시적 형변환. 상위타입이 하위타입으로 변환
		// child2라는 변수는 Child 타입. 가지고 있는 참조는 Child참조
		// 하위 형변환을 위해서는 하위타입참조값을 가지고 있어야 한다.******
//		Child child2=(Child) new Parent(); // TypeCastingException******
		Child child2=(Child) parent2; //******
		System.out.println(child2.getName());
		
		Parent parent3=child2;
		
	}
	
}
