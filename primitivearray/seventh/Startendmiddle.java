package com.onesoft.primitivearray.seventh;

public class Startendmiddle {

	public static void main(String[] args) {
		String[] names= {"vijj","gopi","names","arul","petchi"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].startsWith("a"));
	}
		for(int i=0;i<names.length()-1)
	System.out.println("   ");
	
	for(int i=names.length-1;i>=0;i--) {
		System.out.println(names[i].endsWith("b"));

}
	System.out.println(" ");
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i].charAt(names[i].length()/2));
	
}
}
}