package edu.java.gui;

import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUIExer2 extends JFrame {

	// 생성자가 init()라는 메소드 호출
	GUIExer2() {
		init();
	}
	
	// 메소드 init()
	public void init() {
		
		this.setLayout(new GridLayout(3, 2));
		this.setBounds(new Rectangle(400, 400));
		this.setTitle("Swing JFrame");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		 JOptionPane.showConfirmDialog(this, "확인하시오");
		
		 
		 
	} // init()
	
	public static void main(String[] args) {
		new GUIExer2();
	} // main
	
} // class
