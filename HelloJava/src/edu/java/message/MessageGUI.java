package edu.java.message;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class MessageGUI extends JFrame{

	public MessageGUI() {
		init();
	}
	
	void init() {
		
		this.setTitle("MessageGUI");
		this.setLayout(new BorderLayout());
		this.setBounds(new Rectangle(500, 500));
		
		JScrollPane jsp=new JScrollPane();
		this.add(jsp, BorderLayout.CENTER);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JTextArea jta=new JTextArea(20, 30);
		jsp.setViewportView(jta);
		
		JButton button=new JButton("데이터 가져오기");
		this.add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener() { // ActionListener는 인터페이스니까 익명객체로 구현함
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BufferedReader br=null;
				
				try {
					
					br=new BufferedReader(new FileReader("C:/java_logs/log_20231121.txt"));
				
					String printStr="";
					String readBuffer="";
					
					while((readBuffer=br.readLine()) != null) {
						printStr += readBuffer + "\n";
					}
					
					jta.setText(printStr);
					
				} catch(FileNotFoundException fnfe) {
					fnfe.printStackTrace();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				} 
				
				finally {
					try {
						br.close();
					} catch(IOException ioe) {
						ioe.printStackTrace();
					}
				} // finally
				
			} // Override
		});
		
		this.setVisible(true);
		
	} // init()
	
	public static void main(String[] args) {
		new MessageGUI();
	} // main
	
} // class
