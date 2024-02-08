package edu.java;

import java.util.ArrayList;

public class TypeCastingMain2 {

	public static void main(String[] args) {
		
	ArrayList<Object>al=new ArrayList<Object>();
	
	// 넣는다. 상위 형변환으로
	al.add(new Parent());
	al.add(new Child());
	
	// 꺼낸다. 하위 형변환으로. 타입을 알 때.
	Parent parent=(Parent) al.get(0);
	Child child=(Child) al.get(1);
	
	// 이렇게 꺼내는 것도 가능. 타입을 모를 때. 타입을 모르니까 최상위인 Object로 꺼냄.
	Object parent=al.get(0);
	Object child=al.get(1);
	}
}
