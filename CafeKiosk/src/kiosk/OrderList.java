package kiosk;

import java.util.ArrayList;

public abstract class OrderList {

	// 필드
	public String menu;
	public ArrayList<SubFrame> option;
	public int price;
	
	// 생성자
	public OrderList() {
		// TODO Auto-generated constructor stub
	}

	public OrderList(String menu, ArrayList<SubFrame> option, int price) {
		this.menu = menu;
		this.option = option;
		this.price = price;
	}

	// getter
	public OrderList getOrderList();

	
/*	
	// 싱글톤 패턴으로 만들어보자..............
	// 그만 만들어보자...........
	
	private static OrderList orderList=(OrderList) new JLabel("주문내역");
	
	private OrderList() {

	}
	
	public static OrderList getOrderList() {
//		orderList.setVisible(true);
		return orderList;
	}
*/	
}
