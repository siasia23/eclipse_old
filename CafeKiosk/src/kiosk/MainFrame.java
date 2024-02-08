package kiosk;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame extends OrderList {
	
	MainFrame mainFrame;
	
	private JFrame frame=new JFrame();
	
	// 버튼 생성
	JButton americano=new JButton("아메리카노");
	JButton latte=new JButton("라떼");
	JButton cappuccino=new JButton("카푸치노");
	JButton mocha=new JButton("카페모카");
	JButton ade=new JButton("에이드");
	JButton tea=new JButton("티");
	
	JButton orderClear = new JButton("주문 취소");
	JButton orderOK = new JButton("주문 하기");
	
	@Override
	public OrderList getOrderList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public MainFrame() {
		init();
	}

	// 메뉴 버튼들 위치 설정 메소드
	void setBtn(JButton btn, int x, int y, int w, int h) {
		btn.setBounds(x, y, w, h);
		frame.getContentPane().add(btn);
	}
	
	// 프레임 생성 메소드
	public void init() {
		
		// 프레임 기본 설정
		frame.setTitle("주문하세요!");
		frame.setBounds(100, 100, 513, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
/*		
		// 메뉴 버튼들
		String[] menuList={"아메리카노","라떼","카푸치노","모카","Ade","Tea"};
		JButton[] menuBtn=new JButton[menuList.length]; 	
		
		for (int i=0; i<menuList.length; i++) {
			
			// 배열대로 버튼 생성
			menuBtn[i]=new JButton(menuList[i]);
			menuBtn[i].setBounds(new Rectangle());
			this.getContentPane().add(menuBtn[i]);
			
		} // for i
*/
		
		// 메뉴 버튼 위치 설정
		// setBtn 메소드 호출
		setBtn(americano, 12, 10, 150, 150);
		setBtn(latte, 174, 10, 150, 150);
		setBtn(cappuccino, 336, 10, 150, 150);
		setBtn(mocha, 12, 168, 150, 150);
		setBtn(ade, 174, 168, 150, 150);
		setBtn(tea, 336, 168, 150, 150);
		setBtn(orderClear, 12, 488, 230, 50);
		setBtn(orderOK, 256, 488, 230, 50);
		
		
		// 메뉴 버튼 리스트
		List<JButton> btnList = new ArrayList<JButton>();
		
		btnList.add(americano);
		btnList.add(latte);
		btnList.add(cappuccino);
		btnList.add(mocha);
		btnList.add(ade);
		btnList.add(tea);
		
		for (JButton btn : btnList) {
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new SubFrame(mainFrame);	// 메뉴 버튼 누를때마다 SubFrame 객체생성
				}
			});
			
		} // for
		
	
		// 주문 내역 표기 창
		JLabel orderList = new JLabel("주문 내역");
		orderList.setBounds(12, 328, 312, 150);
		frame.getContentPane().add(orderList);
		
		
		
		
		
		// 주문금액 표기 창
		JLabel totalPriceWon = new JLabel("결제금액");
		totalPriceWon.setBackground(SystemColor.textHighlightText);
		totalPriceWon.setBounds(336, 428, 150, 50);
		frame.getContentPane().add(totalPriceWon);
		
		
		
		
		
		
		// 주문 취소 버튼 이벤트
		orderClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				orderList.setText("주문 내역");
			}
		});
		
		// 주문 버튼 이벤트
		

		
		
		
		// 합계
		JTextField totalPrice = new JTextField();
		totalPrice.setBackground(SystemColor.textHighlightText);
		totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		totalPrice.setText("합계");
		totalPrice.setEnabled(false);
		totalPrice.setEditable(false);
		totalPrice.setColumns(10);
		totalPrice.setBounds(336, 378, 150, 50);
		frame.getContentPane().add(totalPrice);

		frame.setVisible(true);
		
	} // init()
	
} // class
