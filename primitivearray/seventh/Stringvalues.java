package com.onesoft.primitivearray.seventh;

public class Stringvalues {

	public static void main(String[] args) {
		String[] names= {"nam","data","cou","wow","tree","dog"};
		for(int i=names.length/2;i<names.length;i++) {
			System.out.println("first off forward"+names[i]);
			
		}System.out.println(" ");
		
		
		for(int i=0;i<names.length/2;i++) {
			System.out.println("second off forward "+names[i]);
		}System.out.println(" ");
		
		for(int i=names.length-1;i>=names.length/2;i--) {
			System.out.println("reverse "+names[i]);
		}
		System.out.println(" ");
		
		for(int i=names.length/2;i>=0;i--) {
System.out.println("reverse "+names[i]);
	}
	}
}
