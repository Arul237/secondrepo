package com.onesoft.function.nine;

public class College {
String name;
String location;
int fees;
char grade; 
public String findmaxfee(College[] a) {
	int max=a[0].fees;
	String temp="";
	for(int i=0;i<a.length;i++) {
		if(a[i].fees>=max) {
			max=a[i].fees;
			temp=a[i].name;
		}
	}
	return temp;
}
}
