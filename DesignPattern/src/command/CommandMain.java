package command;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CommandMain {

	public static void main(String[] args) {

		Command command=null;
		
		Scanner scanner=new Scanner(System.in);
		String inputStr = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(inputStr);
		
		String op1=""; 	// 첫번째 숫자
		String op2=""; 	// 두번째 숫자
		String opr=""; 	// 연산자
		
		if (st.hasMoreElements()) op1 = st.nextToken();
		if (st.hasMoreElements()) op2 = st.nextToken();
		if (st.hasMoreElements()) opr = st.nextToken();

/*
		if (opr.equals("+")) command=new AddCommand();
		if (opr.equals("-")) command=new SubCommand();
		if (opr.equals("*")) command=new MultiCommand();
		if (opr.equals("/")) command=new DevCommand();
*/
		
		// Properties 객체에 key들이 저장됨
		// 키와 값이 모두 String인 Map
		Properties prop=new Properties();
		
		try {
			
			prop.load(new FileReader("D:/eclipse_workspace/DesignPattern/src/command/command.properties"));
												// 이 파일은 key=value 형태로 작성되어있다.
			
			// (String)prop.getProperty(opr) : 명령 처리 클래스 이름
			Class cl = Class.forName((String)prop.getProperty(opr));
			
			// 명령 처리 클래스의 객체 생성
			Command obj= (Command) cl.newInstance();
			
			// 명령 처리 클래스들이 오버라이딩 한 execute 메소드를 호출해서 연산결과를 result에 저장
			float result =
					obj.execute(Integer.parseInt(op1), Integer.parseInt(op2));
			  
			System.out.println("결과 : " + result);
			
		} catch (IllegalAccessException iae) {
			iae.printStackTrace();
		} catch (InstantiationException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
/*
 			Set<String> keySet = prop.stringPropertyNames();
			
			Iterator<String> it = keySet.iterator();
 
			while (it.hasNext()) {
				
				String key = (String) it.next();
				String value= (String) prop.getProperty(key);
				System.out.println(value);
			
			}
*/
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} // try-catch
		
	} // main

} // class
