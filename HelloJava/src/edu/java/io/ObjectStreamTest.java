package edu.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		
		Person person1=new Person("123456-1234567","이름",20);
		
//		FileOutputStream fos=new FileOutputStream("C:/data/person1.obj");
		
		ObjectOutputStream oos=null;
		ObjectOutputStream oos2=null;
		ObjectInputStream ois=null;
		
		try {
			oos=new ObjectOutputStream(
						new FileOutputStream("C:/data/person1.obj")
					);
			oos.writeObject(person1);
			oos.flush(); // write와 한 쌍
			
			
			// 실습 3. person1.obj 파일을 역직렬화해서 Person 객체로 만들고, Person1_copy.obj로 직렬화하기
			ois=new ObjectInputStream(
						new FileInputStream("C:/data/person1.obj")
					);
			Person person2=(Person) ois.readObject(); 
			// readObject의 반환타입이 Object니까 (Person)으로 형변환
			
			oos2=new ObjectOutputStream(
						new FileOutputStream("C:/data/person1_copy.obj")
					);
			oos2.writeObject(person2);
			oos2.flush();
			
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} finally {
			try {
				oos.close();
				ois.close();
				oos2.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main
	
} // class
