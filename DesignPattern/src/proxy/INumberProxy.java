package proxy;

// 프록시 역할
public class INumberProxy implements INum {

	private INum inum;
	
	@Override
	public void print(int i) {
		
		if (i>5) {
			
			inum=new INumber();
			new INumber().print(i);
		
		} else {
			System.out.println(i);
		}
		
	} // print
	
}
