package com.onesoft.fourth;

public class Parsefloatmethod {
public static void main(String[] args) {
	float num1=Float.parseFloat(args[0]);
	float num2=Float.parseFloat(args[1]);
	float total=num1+num2;
	float sub=num1-num2;
	float diiv=num1/num2;
	float modul=num1%num2;
	float mul=num1*num2;

	System.out.println("addition = "+total);
	System.out.println("subtraction = "+ sub);
	System.out.println("division = "+ diiv);
	System.out.println("modules = "+ modul);
	System.out.println("multiplication = "+mul);
}
}
