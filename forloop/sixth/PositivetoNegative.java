package com.onesoft.forloop.sixth;

public class PositivetoNegative {

	public static void main(String[] args) {
		int positive=0;
		int negative=0;
		int netural=0;
		for (int i=-25;i<=25;i++) {
			if(i<0) {
				positive++;
				
			}
			else if(i==0) {
				netural++;
				
			}
			else {
			negative++;
			}}
		
			System.out.println(positive);
			System.out.println(netural);
			System.out.println(negative);
		}

	}


