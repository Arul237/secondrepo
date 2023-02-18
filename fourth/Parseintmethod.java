package com.onesoft.fourth;

public class Parseintmethod {
public static void main(String[] args) {
	
	int num1=Integer.parseInt(args[0]);// right click run as and select run configuration
	int num2=Integer.parseInt(args[1]);// check project file and package name
	int total=num1+num2;               //  and select arguments declare input value 
	int subb=num1-num2;                // "100" "200"  single space  args[0] args[1] storage value name
	int mul=num1*num2;
	int div=num1/num2;
	int mud=num1%num2;
	System.out.println("addition = "+total);
	System.out.println("subtraction = "+subb);
	System.out.println("multiplication = "+ mul);
	System.out.println("division = "+div);
	System.out.println("modules = "+ mud);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
