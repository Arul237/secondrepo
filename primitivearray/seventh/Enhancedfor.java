package com.onesoft.primitivearray.seventh;

public class Enhancedfor {

	public static void main(String[] args) {
		int[] nums= {25,25,25,21,52,21};
		int add=0;
		for(Integer x:nums) {
		add =add+x;}
			System.out.println(add);
		
        String[] numss= {"vijj","gopi","names","arul","petchi"};
        for (String x:numss) {
        	System.out.println(x);
        }
	}

}
//for (wrapperclass variablename:array variable name){
//}