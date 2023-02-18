package com.onesoft.primitivearray.seventh;

public class Printindividualinitial {

	public static void main(String[] args) {
		//individual initial value of array method
		// data type [] variable= new datatype[];
		int[] ages =new int[5];
		 ages[0]=25;
		ages[1]=22;
		ages[2]=23;
		ages[3]=24;
		ages[4]=25;
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		// bulk initial value is int[] ages={28,25,24,26};

	}

}
