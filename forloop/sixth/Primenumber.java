  package com.onesoft.forloop.sixth;

public class Primenumber {

	public static void main(String[] args) {
		int  num=67;
		boolean ans=true;
		for(int i=2;i<67;i++) {
			if (num%i==0) {
				ans=false;
			}
		}
		if(ans==true) {
			System.out.println(num+"is prime");
		}
		else {
			System.out.println(num+"is not prime");
		}

	}

}
