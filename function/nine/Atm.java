package com.onesoft.function.nine;

public class Atm {
String bankname;
String location;
int balance;
int depositamount;
public String findcredit(int a1,int a2) {
	return "creditamount is "+(a1+a2);
}
public String findDebit(int a1,int a2) {
	return "debitamount is "+(a1-a2);    
}

}
