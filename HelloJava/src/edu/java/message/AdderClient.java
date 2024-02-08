package edu.java.message;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AdderClient extends JFrame {
	
	final static String IP="172.30.1.99";
	final static int PORT=5678;
	
	public AdderClient() {
		init();
	}

	void init() {
		
		this.setTitle("AdderClient");
		this.setLayout(new BorderLayout());
		this.setBounds(new Rectangle(300, 300));
		
		JPanel northPanel=new JPanel(new BorderLayout());
		JPanel southPanel=new JPanel(new BorderLayout());
		this.add(northPanel, BorderLayout.NORTH);
		this.add(southPanel, BorderLayout.SOUTH);
		
		JTextArea textAreaIn=new JTextArea();
		northPanel.add(textAreaIn);
		JTextArea result=new JTextArea();
		southPanel.add(result);
		
		JButton button=new JButton("Start");
		southPanel.add(button, BorderLayout.SOUTH);
		
		// 버튼 동작
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
				Socket socket=null;
				DataInputStream in=null;
				DataOutputStream out=null;
						
				try {
						
					socket=new Socket(IP, PORT);
					in=new DataInputStream(socket.getInputStream());
					out=new DataOutputStream(socket.getOutputStream());
			
					int readedInt=in.readInt();
					textAreaIn.setColumns(readedInt);
						
					while(readedInt != 0) {
						out.write(readedInt);
						result.setColumns(readedInt);
					}
						
//					out.flush();
					
						
					} catch (IOException ioe) {
						ioe.printStackTrace();
					} 
					
					finally {
						try {
							out.close();
							in.close();
							socket.close();
						} catch (IOException ioe) {
							ioe.printStackTrace();
						}
					} // finally
				
				
			}
		}); // 버튼 동작

		this.setVisible(true);
		
	} // init()
	
	public static void main(String[] args) {
		new AdderClient();
	}
	
} // class
