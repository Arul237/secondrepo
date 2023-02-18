package com.onesoft.function.nine;

public class Findmax {
public String find() {
	int a=45;
	int b=48;
	int c=78;
	
	
	if(a>b && a>c) {
		return a+" Great";
	}
	else if(b>a && b>c) {
		return b+" Great";
	}
	else {
		return c+" Great";
	}
}
}
