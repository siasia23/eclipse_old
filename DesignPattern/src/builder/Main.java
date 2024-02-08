package builder;

public class Main {

	public static void main(String[] args) {

		Builder builder=null;
		
		Director director=new Director(builder);
		
		director.construct();
		
	}

}
