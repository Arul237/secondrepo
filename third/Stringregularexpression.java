package com.onesoft.third;

public class Stringregularexpression {
public static void main(String[] args) {
	String name ="welcome+of-java";// split the string regex
	String[] value=name.split("\\W");// special character using //W 
	System.out.println(value[0]);
}
}
