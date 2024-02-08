package prototype;

public interface Product extends Cloneable{

	// 인터페이스니까 메소드는 추상메소드
	public abstract void use();
	
	// 클론을 만들거니까 반환타입은 오브젝트
	public abstract Object createClone() throws CloneNotSupportedException;
	
}
