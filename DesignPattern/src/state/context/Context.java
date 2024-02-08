package state.context;

import java.util.List;

public interface Context {

	// 숫자 뽑는 메소드
	public abstract void setNum();
	
	// 생성된 숫자에 따라 상태 발생시키는 메소드
	// 3의 경우 홀수이면서 3의 배수이므로 중복 제거하기 위해 리스트 사용
	public abstract List<State> changeState(int num);
	
	// 상태에 따른 메세지 출력 메소드
	public abstract void print(State state);
	
}
