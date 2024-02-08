package command;

// 곱셈
public class MultiCommand implements Command {

	@Override
	public float execute(int x, int y) {
		return x*y;
	}
	
}
