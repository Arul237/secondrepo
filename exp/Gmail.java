package com.onesoft.exp;

public class Gmail {
public static void main(String[] args) throws Exception {
	String a="arul@gmail";
	try {
		if(a.endsWith("@gmail") || a.endsWith("@yahoo")) {
		throw new Exception("match");
	}
		else {
			System.out.println("not found");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
