package com.onesoft.fourth;

public class Splittest {
public static void main(String[] args) {
	String[] a=args[0].split(" ");
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	int a1=Integer.parseInt(a[0]);
	int a2=Integer.parseInt(a[1]);
	int a3=Integer.parseInt(a[2]);
	int total = a1+a2+a3;
	System.out.println(total);
	
}
}
