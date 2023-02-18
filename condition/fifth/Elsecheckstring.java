package com.onesoft.condition.fifth;

public class Elsecheckstring {
public static void main(String[] args) {
	String var="Checking";
	if(var.equals(var.toUpperCase())   ) {
		System.out.println(var+ " its toUpperCase");
	}
	else if (var.equals(var.toLowerCase())){
		System.out.println(var + " its tolowercase");
	}
	else {
		System.out.println(var+ " its combinations of upper and lower");
	}
			
}
}
