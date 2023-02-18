package com.onesoft.third;

public class Substringg {
public static void main(String[] args) {
	String vari=args[0];
	char a=vari.charAt(0);
	int b=vari.length();
	System.out.println(a);
	String substring=vari.substring(b-1,b-0);//including space count
	System.out.println(substring);
	
}
}
