package com.onesoft.fourth;

public class Parsedouble {
public static void main(String[] args) {
	double num1=Double.parseDouble(args[0]);
	double num2=Double.parseDouble(args[1]);
	double total= num1+num2;
	double sub=num1-num2;
	double div=num1/num2;
	double mul=num1*num2;
	double mod=num1%num2;
	System.out.println("addition = "+ total);
	System.out.println("subtraction = "+ sub);
	System.out.println(" multiplication = "+ mul);
	System.out.println("division = "+ div);
	System.out.println("modules = "+mod);
}
}
