package com.onesoft.oops2.eleven;

public class UseBankLoan {

	public static void main(String[] args) {
		Bankloan no=new Bankloan();
		System.out.println(no.getLoan(0));
		System.out.println(no.getLoanSlip(30000, 10));
		System.out.println(no.getProprity(3000, 30000, 1200000));

	}

}
