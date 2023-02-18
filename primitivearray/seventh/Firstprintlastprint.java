package com.onesoft.primitivearray.seventh;

public class Firstprintlastprint {

	public static void main(String[] args) {
		String[] names= {"vijj","gopi","names","arul","petchi"};
		for(int i=0;i<=names.length/2;i++) {
			System.out.println(names[i].charAt(i));
		}
		System.out.println("  ");
		
		for(int i=names.length/2-1;i>=0;i--) {
			System.out.println(names[i]);
			
		}
	}

}
