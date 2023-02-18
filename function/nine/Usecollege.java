package com.onesoft.function.nine;

public class Usecollege {

	public static void main(String[] args) {
		College c1 = new College();
		c1.name="kongu";
		c1.location="perundurai";
		c1.fees=154252;
		c1.grade='s';
		College c2 = new College();
		c2.name="srv";
		c2.location="namakkal";
		c2.fees=200000;
		c2.grade='D';
		College c3 = new College();
		c3.name="psg";
		c3.location="covai";
		c3.fees=250000;
		c3.grade='A';
		College[] colleges= {c1,c2,c3}; 
		System.out.println(c1.findmaxfee(colleges));
	}

}
