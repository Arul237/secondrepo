package com.onesoft.oops2.eleven;

public class Inheritance3 {

	public static void main(String[] args) {
		
			Inheritance2 ne=new Inheritance2();
			ne.model="vsz";
			ne.automatic=false;
			
			System.out.println(ne.model);
			Inheritance1 nee=new Inheritance1();
			nee.brand="alto";
			nee.color="yelow";
			nee.price=47778;
			nee.tax=22;
			nee.findtax(0);
			System.out.println(nee.brand+nee.color+nee.findtax(0));
			
			Inheritance1 ni=new Inheritance2();
			ni.brand="audi";
              
              System.out.println(ni.discountAmount);
			
	}

}
