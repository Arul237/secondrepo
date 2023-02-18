package com.onesoft.primitivearray.seventh;

public class Maximumstringminimum {

	public static void main(String[] args) {
		String[] names= {"vijj","gopi","names","arul","petchi"};
		int max=0;
		String temp="";
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>max) {
				max=names[i].length();
				temp=names[i];
			}
	}
		System.out.println(temp);

}
}