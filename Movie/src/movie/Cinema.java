package movie;

import java.util.List;

// 영화관. 5개의 상영관
public class Cinema {
	
	private List<Room> roomList; // Cinema는 Room들의 List를 갖는다.
	
	public Cinema() {
	}

	public Cinema(List<Room> roomList) {
		super();
		this.roomList = roomList;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public String toString() {
		return "Cinema [roomList=" + roomList + "]";
	}

}
