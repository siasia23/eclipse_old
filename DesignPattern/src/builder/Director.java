package builder;

public class Director {

	Builder builder;
	
	// Builder 타입을 인자로 갖는 생성자
	public Director(Builder builder) { 
		this.builder=builder;
	}
	
	// 추상 클래스 Builder의 추상 메소드를 구현한 메소드
	public void construct() {
		
		builder.makeTitle();
		builder.makeString();
		builder.makeItems();
		builder.getResult();
		
	}
	
}
