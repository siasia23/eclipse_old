package edu.java.thread;

// 공유객체
public class SharedObject {

	private int sharedNum;		// 1~30 숫자
	private boolean isEvened;	// 짝수 출력 여부
	// flag 변수
	
	public SharedObject() {
	}

	public SharedObject(int sharedNum, boolean isEvened) {
		super();
		this.sharedNum = sharedNum;
		this.isEvened=isEvened;
	}

	public int getSharedNum() {
		return sharedNum;
	}

	public void setSharedNum(int sharedNum) {
		this.sharedNum = sharedNum;
	}

	public boolean isEvened() {
		return isEvened;
	}

	public void setEvened(boolean isEvened) {
		this.isEvened = isEvened;
	}

}
