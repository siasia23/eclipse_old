package edu.java.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// java i.o package > File, FileWriter, FileReader
public class FileTest {

	public static void main(String[] args) {
		
		File f=new File("C:/memopad/test.txt"); // C드라이브>memopad 폴더>test.txt 파일생성
		if(!f.exists()) { // 만약 존재하지 않으면
			try {
				f.createNewFile(); // 새로 만든다.
			} catch (IOException ioe) { // 예외 발생하면
				ioe.printStackTrace(); // 경로 추적하라.
			}
		} // if
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			fw.write("안녕하세요!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally { // 닫아주기, 종료
			try {
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main
} // class
