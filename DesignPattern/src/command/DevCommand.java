package command;

// 나눗셈
public class DevCommand implements Command {

	@Override
	public float execute(int x, int y) {
		return (float) x/y;
	}
	
}
