package edu.java.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIExer1 extends Frame {
	
	Image img=null;
	
	// 생성자
	GUIExer1() {
		
		// 설정
		this.setTitle("처음 만드는 프레임");
		this.setBackground(Color.ORANGE);
		this.setSize(400, 400);
		this.setLayout(new BorderLayout());
		
		// 동작 추가
		this.addWindowListener(new WindowAdapter() { // 익명객체
			
			@Override
			public void windowClosing(WindowEvent e) { // 오버라이딩
				System.out.println(e.getClass().getName());
				dispose();
			}
			
		}); // 창 닫는 기능 구현
		
		// 버튼
		Button button=new Button("버튼"); // Button is Component

		// 버튼 설정
		button.setBackground(Color.blue);
		button.setSize(200, 200);
		this.add(button, BorderLayout.NORTH);
		
		// 버튼 동작 추가
		button.addActionListener(new ActionListener() { // 인터페이스 ActionListener를 구현하는 익명객체
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 누름");
			}
			
		});
		
		// 텍스트 입력창, 버튼2
		TextField tf=new TextField("여기에입력", 10);
		Button button2=new Button("확인");
		Panel panel=new Panel(new BorderLayout());
		panel.add(tf, BorderLayout.WEST);
		panel.add(button2, BorderLayout.EAST);
		this.add(panel, BorderLayout.SOUTH);
		
		// 버튼2 동작 추가
		button2.addActionListener(new ActionListener() { // 인터페이스 ActionListener를 구현하는 익명객체
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText()+"가 입력됨");
			}
			
		});
		
		// 이미지 삽입
		String imgPath="C:/data/다운로드.jpeg";
		img=Toolkit.getDefaultToolkit().getImage(imgPath);
		
		this.setVisible(true);
		
	} // 생성자
	
	public static void main(String[] args) {
		
		new GUIExer1();
		
	} // main
	
	@Override
	public void paint(Graphics g) {

		g.drawImage(img, 0, 0, this);
		
	} // paint
	
} // class
