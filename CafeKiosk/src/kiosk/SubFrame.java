package kiosk;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

// [Hot],[Ice]
// [연하게][샷 추가]
// [물 적게][물 많이]
// [얼음 적게][얼음 많이]
// [매장이용][포장]
// [취소][주문하기]

public class SubFrame extends OrderList {
	
//	JLabel orderList;
	
	MainFrame mainFrame;
	OrderList orderList;
	
	private JFrame frame=new JFrame();
	
	// 버튼 생성
	private JToggleButton hot=new JToggleButton("Hot");
	private JToggleButton ice=new JToggleButton("Ice");
	
	private JToggleButton shotMinus=new JToggleButton("연하게");
	private JToggleButton shotPlus=new JToggleButton("샷 추가");
	
	private JToggleButton waterLess=new JToggleButton("물 적게");
	private JToggleButton waterMore=new JToggleButton("물 많이");
	
	private JToggleButton iceLess=new JToggleButton("얼음 적게");
	private JToggleButton iceMore=new JToggleButton("얼음 많이");
	
	private JToggleButton dineIn=new JToggleButton("매장 이용");
	private JToggleButton takeOut=new JToggleButton("포장");
	
	private JButton optionOK=new JButton("주문하기");
	private JButton optionClear=new JButton("취소");
	
	// 생성자
	public SubFrame(MainFrame mainFrame) {
		popUp(mainFrame); 	// 화면에 프레임 띄우기
	}
	
	// 버튼 위치 설정 메소드
	void setBtn(JToggleButton btn, int x, int y, int w, int h) {
		btn.setBounds(x, y, w, h);
		frame.getContentPane().add(btn);
	}

	// 프레임 생성 메소드
	public void popUp(MainFrame mainFrame) {
		
		// 프레임 기본설정
		frame.setTitle("Option");
		frame.setBounds(100, 100, 300, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		// 버튼 위치 설정
		setBtn(hot, 25, 30, 110, 40);
		setBtn(ice, 147, 30, 110, 40);
		setBtn(shotMinus, 25, 80, 110, 40);
		setBtn(shotPlus, 147, 80, 110, 40);
		setBtn(waterLess, 25, 131, 110, 40);
		setBtn(waterMore, 147, 130, 110, 40);
		setBtn(iceLess, 25, 181, 110, 40);
		setBtn(iceMore, 147, 181, 110, 40);
		setBtn(dineIn, 25, 231, 110, 40);
		setBtn(takeOut, 147, 231, 110, 40);

		// 버튼 리스트
		List<JToggleButton> btnList=new ArrayList<JToggleButton>();

		btnList.add(hot);
		btnList.add(ice);
		btnList.add(shotMinus);
		btnList.add(shotPlus);
		btnList.add(waterLess);
		btnList.add(waterMore);
		btnList.add(iceLess);
		btnList.add(iceMore);
		btnList.add(dineIn);
		btnList.add(takeOut);

		// 버튼 이벤트
		hot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ice.isSelected()) hot.setSelected(false);
			}
		});
		
		ice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (hot.isSelected()) ice.setSelected(false);
			}
		});
		
		shotMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (shotPlus.isSelected()) shotMinus.setSelected(false);
			}
		});
		
		shotPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (shotMinus.isSelected()) shotPlus.setSelected(false);
			}
		});
		
		waterLess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (waterMore.isSelected()) waterLess.setSelected(false);
			}
		});
		
		waterMore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (waterLess.isSelected()) waterMore.setSelected(false);
			}
		});
		
		iceLess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (iceMore.isSelected()) iceLess.setSelected(false);
			}
		});
		
		iceMore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (iceLess.isSelected()) iceMore.setSelected(false);
			}
		});
		
		dineIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (takeOut.isSelected()) dineIn.setSelected(false);
			}
		});
		
		takeOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (dineIn.isSelected()) takeOut.setSelected(false);
			}
		});
		

		
		// [취소] JButton
		optionClear.setFont(new Font("굴림", Font.BOLD, 15));
		optionClear.setBounds(25, 281, 110, 40);
		frame.getContentPane().add(optionClear);
		
		optionClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		// [주문하기] JButton
		optionOK.setFont(new Font("굴림", Font.BOLD, 15));
		optionOK.setBounds(147, 281, 110, 40);
		frame.getContentPane().add(optionOK);
		
		optionOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				setOrderList();
			}
		});
		
	} // popUp()

/*	
	public void getOrderList() {
		orderList.setO
	}
*/
	
	@Override
		public OrderList getOrderList() {
			// TODO Auto-generated method stub
			return null;
		}
	
	// JLable orderList에 선택된 문자열 출력하는 메소드
	public void setOrderList() {
		
		JLabel orderList=new JLabel();
//		OrderList.getOrderList();
		
		List<String> selectedOption = new ArrayList<String>();

		if (hot.isSelected()) selectedOption.add("Hot");
		if (ice.isSelected()) selectedOption.add("Ice");
		if (shotMinus.isSelected()) selectedOption.add("연하게");
		if (shotPlus.isSelected()) selectedOption.add("샷 추가");
		if (waterLess.isSelected()) selectedOption.add("물 적게");
		if (waterMore.isSelected()) selectedOption.add("물 많이");
		if (iceLess.isSelected()) selectedOption.add("얼음 적게");
		if (iceMore.isSelected()) selectedOption.add("얼음 많이");
		if (dineIn.isSelected()) selectedOption.add("매장 이용");
		if (takeOut.isSelected()) selectedOption.add("포장");  	
		
		String printStr = "";
		
		for (String selectedStr : selectedOption) {
			printStr += selectedStr + ", ";
		}
		
//		if (optionOK.isSelected()) 
		orderList.setText(printStr);
		
	} // setOrderList()
	
} // class
