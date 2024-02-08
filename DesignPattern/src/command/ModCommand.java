package command;

// 모듈러스?
public class ModCommand implements Command {

	@Override
	public float execute(int x, int y) {
		return x%y;
	}
	
}
