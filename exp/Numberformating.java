package com.onesoft.exp;

public class Numberformating {
	public static void main(String[] args) {
		
	
String a="Sssss";

try {
	int val=Integer.parseInt(a);
	//System.out.println(val);
}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	System.out.println("invalid");
}
}
}