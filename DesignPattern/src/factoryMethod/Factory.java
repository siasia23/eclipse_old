package factoryMethod;

public abstract class Factory {
	
	public Product create(String name) { // 다른 메소드를 호출하기 위한 템플릿 메소드 패턴
		
		Product product=createProduct(name);
		
		registerProduct(product);
		
		return product; 	// 참조타입을 반환할 때는 그 객체를 반환해야함.
								// 기본타입 반환할 때는 그 타입 자체를 반환. return int;
	}
	
	public abstract Product createProduct(String name);
		
	public abstract void registerProduct(Product product);
	
}
