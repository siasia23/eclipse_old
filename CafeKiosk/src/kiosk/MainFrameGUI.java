package kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class MainFrameGUI {

	private JFrame frame;
	private JTextField orderList;
	private JTextField totalPriceWon;
	private JTextField totalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameGUI window = new MainFrameGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// 기본 설정
		frame = new JFrame();
		frame.setTitle("주문하세요!");
		frame.setBounds(100, 100, 513, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// 메뉴 버튼들
		JButton americano = new JButton("아메리카노");
		americano.setBounds(12, 10, 150, 150);
		frame.getContentPane().add(americano);
		
		JButton mocha = new JButton("카페모카");
		mocha.setBounds(12, 168, 150, 150);
		frame.getContentPane().add(mocha);
		
		JButton latte = new JButton("라떼");
		latte.setBounds(174, 10, 150, 150);
		frame.getContentPane().add(latte);
		
		JButton cappuccino = new JButton("카푸치노");
		cappuccino.setBounds(336, 10, 150, 150);
		frame.getContentPane().add(cappuccino);
		
		JButton ade = new JButton("에이드");
		ade.setBounds(174, 168, 150, 150);
		frame.getContentPane().add(ade);
		
		JButton tea = new JButton("티");
		tea.setBounds(336, 168, 150, 150);
		frame.getContentPane().add(tea);
		
		// 주문 내역 표기 창
		orderList = new JTextField();
		orderList.setBounds(12, 328, 312, 150);
		frame.getContentPane().add(orderList);
		orderList.setColumns(10);
		
		// 주문 취소 버튼
		JButton orderClear = new JButton("주문 취소");
		orderClear.setBounds(12, 488, 230, 50);
		frame.getContentPane().add(orderClear);
		
		// 주문 버튼
		JButton orderOK = new JButton("주문 하기");
		orderOK.setBounds(256, 488, 230, 50);
		frame.getContentPane().add(orderOK);
		
		totalPrice = new JTextField();
		totalPrice.setBackground(SystemColor.textHighlightText);
		totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		totalPrice.setText("합계");
		totalPrice.setEnabled(false);
		totalPrice.setEditable(false);
		totalPrice.setColumns(10);
		totalPrice.setBounds(336, 378, 150, 50);
		frame.getContentPane().add(totalPrice);
		
		// 주문금액 표기 창
		totalPriceWon = new JTextField();
		totalPriceWon.setBackground(SystemColor.textHighlightText);
		totalPriceWon.setEnabled(false);
		totalPriceWon.setEditable(false);
		totalPriceWon.setBounds(336, 428, 150, 50);
		frame.getContentPane().add(totalPriceWon);
		totalPriceWon.setColumns(10);
	}
}
