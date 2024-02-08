package edu.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IOExer1 {

	// 1. diary.txt 파일을 생성하고 오늘 일기 작성 - 문자열 쓸거니까 Writer 사용
	// 2. 파일을 읽어 diary_copy.txt 파일로 복사
	
	public static void main(String[] args) {
		
		Writer fw=null;
		Reader fr=null;
		
		String str="20231114 오늘 추움";
		
		try {
			
			fw=new FileWriter("C:/data/diary.txt");
			fw.write(str);
			
			fr=new FileReader("C:/data/diary_copy.txt");
			
			
			
			
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
				ioe.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main
	
} // class
