package com.onesoft.oops2.eleven;

public class Total {                            //overloading
public int add(int a,int b) {
	return a+b;
	
}
public int add (int a,int b, int c) {
	return a+b+c;
}
public int add(String a,String b) {
	return a.length()+b.length();
}
}
