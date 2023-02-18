package com.onesoft.function.nine;

public class Findmaxstring {
public String size(String[] a) {
	
	int max=a[0].length();
	String x="";
	for(int i=0;i<a.length;i++) {
		if(a[i].length()>=max) {
			x=a[i];
		}
	}                               // return with parameter
	return x;
	
	}
	
	
	
}

