package com.onesoft.test;

public class Lenght {
public static void main(String[] args) {
	String name = "Alexander";
	int leng=name.length();
	System.out.println(leng);
	String low=name.toLowerCase();
	System.out.println(low);
	int count = low.length();
	System.out.println(count);
	String cont="soft";
	
	boolean check=cont.contains("y");
	System.out.println("the contain is " +check);
	
	int co=count-1;
	System.out.println(co);
	
	char let=name.charAt(4);
	System.out.println(let);//1 2 3 4 question answer
	
	
	
	
	
}
}
