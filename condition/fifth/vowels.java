package com.onesoft.condition.fifth;

public class vowels {
public static void main(String[] args) {
	String var=args[0];
	if(var.contains("a")||var.contains("e")||var.contains("i")||var.contains("o")||var.contains("u")) {
		System.out.println(var+" is contain vowels");
	}
	else {
		System.out.println(var+" is not contains");
	}
}
}
