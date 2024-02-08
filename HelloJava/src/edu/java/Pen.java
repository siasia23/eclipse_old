package edu.java;

public class Pen { // 클래스, 멤버변수, 생성자 만들기

	String manufacutreCompany; // 펜의 공통 특성 1. 제조사
	String sort; // 4. 종류
	String colorName; // 2. 색상
	int price; // 3. 가격
	
	Pen(){
		
	} // 기본생성자. 클래스명과 동일하게.
	
	Pen(String manufactureCompany, String sort, String colorName, int price){
		this.manufacutreCompany = manufactureCompany;
		this.sort = sort;
		this.colorName = colorName;
		this.price = price;
	}
	
	String getPenData() { // Pen의 데이터를 가져오는 메소드
		// (Pen pen) : Pen 타입의 변수 pen.
		String resultStr 
				= "이 펜의 제조사는" + this.manufacutreCompany
				+ ", 종류는" + this.sort
				+ ", 색상은" + this.colorName
				+ ", 가격은" + this.price;
		return resultStr;
	}
	
}
