package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	Product product;
	
	Map<String, Object> showcase = new HashMap<String, Object>();
	
	public Manager(Product product) {
		this.product=product;
	}
	
	public void register(String name, Product product) { // 맵에 값을 저장하는(넣는) 메소드
		showcase.put(name, product);
	}
	
	public Object create() throws CloneNotSupportedException { // 복제된 오브젝트 만드는 메소드
		return product.createClone(); // 복제된 오브젝트를 반환하라
	}
	
}
