package com.onesoft.forloop.sixth;

public class Object {

	public static void main(String[] args) {
		String a="ObJeCt";
		int count=0;
		String b=a.toUpperCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				count++;
			}
			System.out.println(count);
		}

	}

}
