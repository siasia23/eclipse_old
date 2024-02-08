package kiosk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CafeOrder_delete extends JFrame {

	public CafeOrder_delete() {
		init();
	}
	
	public void init() {
		
		// 프로그램 기본 설정
		this.setTitle("주문!");
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setBounds(0, 0, 625, 1000);
		
		/* North Panel */
		// [메뉴],[단가]
		Panel nPanel=new Panel();
		this.add(nPanel, BorderLayout.NORTH);
//		nPanel.setSize(0, 500);
/*		
		GridBagLayout gridBag=new GridBagLayout();
		
		nPanel.setLayout(gridBag); // gridBag을 가진 레이아웃을 패널에 붙인다.
		this.add(nPanel);
*/		
		// 메뉴 버튼, 가격 버튼 설정
		String[] menuList={"아메리카노 1500","라떼","카푸치노","모카","Ade","Tea"};
		String[] priceList= {"1500","2000","2000","2500","3500","3500"};
		
		JButton[] menuBtn=new JButton[menuList.length]; 	
		JButton[] priceBtn=new JButton[priceList.length]; 		
		
		// 메뉴 버튼과 단가 버튼 넣기
		for (int i=0; i<menuList.length; i++) {
			
			// 배열대로 버튼 생성
			menuBtn[i]=new JButton(menuList[i]);
			priceBtn[i]=new JButton(priceList[i]);
/*			
			if (i<3) {
				menuBtn[i].setBounds(25+(i*150), 50, 100, 100);
			} else {
				menuBtn[i].setBounds(25+(i-4)*150, 300, 100, 100);
			}
*/			
			nPanel.add(menuBtn[i]);
			nPanel.add(priceBtn[i]);
			
		} // for i
		
		// 메뉴 버튼 이벤트
		for (int j=0; j<menuList.length; j++) {
			// 익명객체 안에서는 for문의 j를 읽을 수 없다.
			final Integer innerJ = new Integer(j);
			
			menuBtn[innerJ].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					menuBtn[innerJ].setEnabled(false);
					new OptionPopUp();
				}
			});			
			
		} // for j

		
		
		
		
		
		// 팝업(메뉴 눌렀을 때) : Clas OptionPopUp에서 구현하기
		// [Hot],[Ice]
		// [샷][-][선택된 수량][+]
		// [물/우유][-][+]
		// [얼음][-][+]
		// [매장이용][포장]
		// [주문 담기][취소]
		
		
		
		
		
		
		/* Center Panel */
		// [주문내역],[합계]
		Panel cPanel=new Panel();
		this.add(cPanel, BorderLayout.CENTER);
		
		TextArea ordering=new TextArea("주문내역", 0, 0, Scrollbar.VERTICAL);
		cPanel.add(ordering);
		ordering.setEditable(false);
		
		JButton totalPrice=new JButton("합계");
		cPanel.add(totalPrice);
		
		
		/* South Panel */
		// [취소],[확인]
		Panel sPanel=new Panel();
		this.add(sPanel, BorderLayout.SOUTH);
		
		sPanel.add(new JButton("취소"), FlowLayout.LEFT);
		sPanel.add(new JButton("확인"));

		
		/* 프로그램 기본 설정 */
		this.pack();
		this.setVisible(true);
		
	} // init()
	
	public static void main(String[] args) {
		new CafeOrder_delete();
	}
	
}
