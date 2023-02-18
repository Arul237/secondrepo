package com.onesoft.primitivearray.seventh;

public class Uppercasecount {

	public static void main(String[] args) {
	String[] names= {"RAM","GOPI","names","arul","petchi"};
	int count=0;
	for(int i=0;i<names.length-1;i++) {
	
		if(Character.isLowerCase(names[i].charAt(i))) {
			count++;
		}}
		System.out.println(count);
		
	

	}
}

