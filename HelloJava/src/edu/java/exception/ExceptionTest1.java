package edu.java.exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		String str1="천";
		int i1=0;
		
		Object obj=null;
		
		try {
			System.out.println(obj.hashCode());
			i1=Integer.parseInt(str1);
		} catch (Exception ex) {
			System.out.println(ex);
		}	
		
		catch (NumberFormatException nfe) {
			System.out.println(nfe);
		} catch (NullPointerException npe) {
			// 아무것도 안 함
		}
		
			
		System.out.println(i1*2);
		
	} // main
	
} // class
