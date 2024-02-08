package prototype;

public class prototypeMain {

	public static void main(String[] args) {

		Product product=new MessageBox("아무 문자열이나 넣자");
		
		Manager manager=new Manager(product);
		
		Product cloneProduct=null;
		
		try {
			
			cloneProduct = (Product) manager.create();
			cloneProduct.use();
			
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		
	} // main

}
