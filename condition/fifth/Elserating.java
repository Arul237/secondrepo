package com.onesoft.condition.fifth;

public class Elserating {
public static void main(String[] args) {
	float var=2.22f;
	
	if(var>0.0 && var<=5.0) {
		System.out.println(var+" Bad");
	}
	else if(var>5.0 && var<=7.5) {
		System.out.println(var+ " Good");
	}
	else {
		System.out.println(var+ "  Great");
	}
}
}
