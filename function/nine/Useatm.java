package com.onesoft.function.nine;

public class Useatm {

	public static void main(String[] args) {
		Atm atm1=new Atm();
		atm1.bankname="Indian bank";
		atm1.location=" chennai";
		atm1.balance=1500;
		atm1.depositamount=4500;
		System.out.println("chennai4");
		System.out.println(atm1.findcredit(atm1.balance,atm1.depositamount));
		System.out.println(atm1.findDebit(atm1.balance,atm1.depositamount));
		Atm atm2=new Atm();
		atm2.bankname="canara bank";
		atm2.location=" salem";
		atm2.balance=8500;
		atm2.depositamount=450;
		System.out.println("salem");
		System.out.println(atm2.findcredit(atm2.balance,atm2.depositamount));
		System.out.println(atm2.findDebit(atm2.balance,atm2.depositamount));
	}

}
