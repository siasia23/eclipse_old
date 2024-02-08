package factoryMethod;

import java.util.List;

public class FactoryMain {

	public static void main(String[] args) {

		Factory factory=new IDCardFactory();
		
		Product product1=factory.create("주민등록증");
		Product product2=factory.create("여권");
		Product product3=factory.create("면허증");
		
		List<Product> productList = ((IDCardFactory) factory).getProductList();
												// IDCardFactory 클래스의 getter에 접근하기 위해, factory를 해당 클래스 타입으로 변환함.
		
		for (Product product:productList) {
			product.use();
		}
		
	} // main

} // class