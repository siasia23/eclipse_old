package factoryMethod;

public class IDCard extends Product{

	private String name;
	
	public IDCard(String name) {
		this.name=name;
	}
	
	@Override
	public void use() {
		System.out.println("종류는 " + name + "입니다.");
	}
	
}
