package command;

// 뺄셈
public class SubCommand implements Command {

	@Override
	public float execute(int x, int y) {
		return x-y;
		
	}
	
}
