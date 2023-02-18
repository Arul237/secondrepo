package com.onesoft.forloop.sixth;

public class Fbanocci {

	public static void main(String[] args) {
		//int val=Integer.parseInt(args[0]);
		int val=5;
		int num1=0;
		int num2=1;
		int add=0;
		int num3=0;
		for (int i=0;i<=val;i++) {
			num3=num1+num2;
			add=add+num1;
			num1=num2;
			num2=num3;
		}
		System.out.println(add);
		
	}

}
