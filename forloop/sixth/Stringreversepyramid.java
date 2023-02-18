package com.onesoft.forloop.sixth;

public class Stringreversepyramid {

	public static void main(String[] args) {
		String temp="";
		String name="java";
		for (int i=name.length()/2-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		
		}
		System.out.println(temp);
	}

}
