package com.onesoft.fourth;

public class ParseLongmethod {
public static void main(String[] args) {
	long num1=Long.parseLong(args[0]);
	long num2=Long.parseLong(args[1]);
	long total=num1+num2;
	long sub=num1-num2;
	long div=num1/num2;
	long mul=num1*num2;
	long mod=num1%num2;
	System.out.println("addition = "+total);
	System.out.println("subtraction = "+sub);
	System.out.println("multiplication = "+mul);
	System.out.println("division = "+div);
	System.out.println("modules = "+mod);
}
}
