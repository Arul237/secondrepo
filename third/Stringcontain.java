package com.onesoft.third;

public class Stringcontain {
public static void main(String[] args) {
	String name="welcome to string";
	boolean lname=name.contains("we");
	System.out.println(lname);
	boolean l2name=name.contains("WE");
	System.out.println(l2name);
	boolean l3name=name.contains("string");
	System.out.println(l3name);
	boolean l4name=name.contains("welome");
	System.out.println(l4name);
}
}
