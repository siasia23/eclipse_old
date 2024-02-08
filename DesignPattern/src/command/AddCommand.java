package command;

// 덧셈
public class AddCommand implements Command {

	@Override
	public float execute(int x, int y) {
		return x+y;
	}
	
}
