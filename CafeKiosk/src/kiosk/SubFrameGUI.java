package kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JToggleButton;

public class SubFrameGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubFrameGUI window = new SubFrameGUI();
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
	public SubFrameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 300, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// 포장 여부
		JToggleButton dineIn = new JToggleButton("매장 이용");
		dineIn.setBounds(25, 231, 110, 40);
		frame.getContentPane().add(dineIn);
		
		JToggleButton takeOut = new JToggleButton("포장");
		takeOut.setBounds(147, 231, 110, 40);
		frame.getContentPane().add(takeOut);
		
		// 주문하기, 취소
		JButton optionOK = new JButton("주문하기");
		optionOK.setFont(new Font("굴림", Font.BOLD, 15));
		optionOK.setBounds(147, 281, 110, 40);
		frame.getContentPane().add(optionOK);
		
		JButton optionClear = new JButton("취소");
		optionClear.setFont(new Font("굴림", Font.BOLD, 15));
		optionClear.setBounds(25, 281, 110, 40);
		frame.getContentPane().add(optionClear);
		
		// 선택된 옵션 창
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(SystemColor.controlHighlight);
		textArea.setBackground(SystemColor.inactiveCaption);
		textArea.setBounds(25, 331, 232, 63);
		frame.getContentPane().add(textArea);
		
		JToggleButton hot = new JToggleButton("Hot");
		hot.setBounds(25, 30, 110, 40);
		frame.getContentPane().add(hot);
		
		JToggleButton ice = new JToggleButton("Ice");
		ice.setBounds(147, 30, 110, 40);
		frame.getContentPane().add(ice);
		
		JToggleButton shotMinus = new JToggleButton("연하게");
		shotMinus.setBounds(25, 80, 110, 40);
		frame.getContentPane().add(shotMinus);
		
		JToggleButton shotPlus = new JToggleButton("샷 추가");
		shotPlus.setBounds(147, 80, 110, 40);
		frame.getContentPane().add(shotPlus);
		
		JToggleButton waterLess = new JToggleButton("물 적게");
		waterLess.setBounds(25, 131, 110, 40);
		frame.getContentPane().add(waterLess);
		
		JToggleButton waterMore = new JToggleButton("물 많이");
		waterMore.setBounds(147, 130, 110, 40);
		frame.getContentPane().add(waterMore);
		
		JToggleButton iceLess = new JToggleButton("얼음 적게");
		iceLess.setBounds(25, 181, 110, 40);
		frame.getContentPane().add(iceLess);
		
		JToggleButton iceMore = new JToggleButton("얼음 많이");
		iceMore.setBounds(147, 181, 110, 40);
		frame.getContentPane().add(iceMore);
	}
}
