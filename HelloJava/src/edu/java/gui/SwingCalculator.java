package edu.java.gui;

import java.awt.*;
import javax.swing.*;

public class SwingCalculator extends JFrame {

	public SwingCalculator() {
		init();
	} // 생성자
	
	public void init() {
		
		// 입력값 표기 창
		JPanel panel=new JPanel();
		
		panel.add(new JTextField("0"), BorderLayout.NORTH);
		panel.setBounds(new Rectangle(1000, 1000));
		
		this.setVisible(true);
		
	} // init()
	
	public static void main(String[] args) {
		new SwingCalculator();
	}
	
} // class
