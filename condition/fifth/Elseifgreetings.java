package com.onesoft.condition.fifth;

public class Elseifgreetings {
public static void main(String[] args) {
	int greeting=14;
	if (greeting>6 && greeting<=11) {
		System.out.println(greeting +" Good morning");
	}
	else if (greeting>12 && greeting<15) {
		System.out.println(greeting + " Good afternoon");
	}
	else if (greeting>16 && greeting<18) {
		System.out.println(greeting +" Good evening");
	}
	else {
		System.out.println(greeting + " Good night");
	}
}
}
