package com.onesoft.condition.fifth;

public class Switchcase {
public static void main(String[] args) {
	String var="north";// its checks to case sensitive 
	switch (var) {
	case "north" :
		System.out.println(" itss is north direction");
	break;
	case "west" : 
		System.out.println("it is south direction");
		break;
	
	case "south" :
		System.out.println("it is east direction ");
	break;
	case "east" :
		System.out.println("it is east direction");
	break;
	default :
		System.out.println("not a direction");
		break;
}
}
}
