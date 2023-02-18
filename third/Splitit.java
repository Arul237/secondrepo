package com.onesoft.third;

public class Splitit {
public static void main(String[] args) {
	String name="apple orange banana";
	String[] values=name.split(" ");
	System.out.println(values[2]);
	int value=name.length();// only count the elements in array
	System.out.println(value);
	int valuew=values.length;
	System.out.println(valuew);
	
	
	
}
}
