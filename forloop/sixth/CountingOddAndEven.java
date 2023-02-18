package com.onesoft.forloop.sixth;

public class CountingOddAndEven {

	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
		System.out.println(evencount);
		System.out.println(oddcount);

	}

	}
}
