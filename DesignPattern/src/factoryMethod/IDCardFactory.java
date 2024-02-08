package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

	private List<Product> productList;
	
	public List<Product> getProductList() { // getter
		return this.productList;
	}

	public IDCardFactory() { // 생성자
		this.productList=new ArrayList<Product>();
	}	
	
	@Override
	public Product createProduct(String name) {
		return new IDCard(name);
	}
	
	@Override
	public void registerProduct(Product product) {
		productList.add(product);
	}
	
}