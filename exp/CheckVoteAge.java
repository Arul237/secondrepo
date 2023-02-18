package com.onesoft.exp;

import java.io.IOException;

public class CheckVoteAge {
public static void main(String[] args) throws IOException,Exception,AgeNotFoundException {
	int age=17;
	try {
		if(age<18) {
			throw new AgeNotFoundException("Not eligible to vote");
		}
		else {
			System.out.println("eligible");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
