package com.onesoft.forloop.sixth;

public class Stringprint { 

	public static void main(String[] args) {
		String temp="";
		String name="java";
		for(int i=0;i<name.length();i++) {
			temp=temp+name.charAt(i);
		}
		System.out.println(temp);
		
	}

}
