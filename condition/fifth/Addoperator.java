package com.onesoft.condition.fifth;

public class Addoperator {
public static void main(String[] args) {
	int var=12;
	int var2=23;
	char operator='+';
	switch (operator) {
	case '+':
		System.out.println(var+var2);
		break;
	case '-':
		System.out.println(var-var2);
		break;
	case '*':
		System.out.println(var*var2);
		break;
	case '%':
		System.out.println(var%var2);
		break;
	case '/':
		System.out.println(var/var2);
		break;
	default	:
		System.out.println(" not in operator");
	}
	
}
}
