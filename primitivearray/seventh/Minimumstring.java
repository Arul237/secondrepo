package com.onesoft.primitivearray.seventh;

public class Minimumstring {

	public static void main(String[] args) {
		String[] names= {"david","gopi","names","arul","petchi"};
		int mini=names[0].length();
		String temp="";
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<=mini) {
				mini=names[i].length();
				temp=names[i];
			}
	}
		System.out.println(temp);

}

	}


