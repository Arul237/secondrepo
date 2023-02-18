package com.onesoft.exp;

public class Nullpoint {
	public static void main(String[] args) {
		String v=null;
	try {
		//int a=6;
		//int b=0;
		int c=v.length();
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();                  //printstacktrace used to identify the error line                                                                 
	}
	finally {
		System.out.println("invalid");
	}
	}
}
