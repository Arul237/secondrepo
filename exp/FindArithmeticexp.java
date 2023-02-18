package com.onesoft.exp;

public class FindArithmeticexp {
public static void main(String[] args) {
	//String v=null;
	try {
	int a=6;
	int b=0;
	int c=a/b;
	//System.out.println(c);                       // arithmetic exception 
}
	catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();                                                                       
	}
	finally {
		System.out.println("valid");
	}
	}

}