package com.onesoft.forloop.sixth;

public class Countaverage {
public static void main(String[] args) {
	int total=0;
	int mul=1;
	int count=0;
	  
	for(int i=1;i<=4;i++) {
		total=total+i;
		mul=mul*i;
		count++;
		
	}
	System.out.println(total);
	System.out.println("average "+(total/count));
}
}
