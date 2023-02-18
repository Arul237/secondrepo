package com.onesoft.for2.eight;

public class Uselaptop {
	
    
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.brand="vivo";
		laptop.price=1245454;
		laptop.color="Green";
		Laptop laptop2=new Laptop();
		laptop2.brand="lenovo";
		laptop2.color="Black";
		laptop2.price=12415852;
		Laptop laptop3=new Laptop();
		laptop3.brand="asus";
		laptop3.price=1557258;
		laptop3.color="white";
		Laptop laptop4=new Laptop();
		laptop4.brand="apple";
		laptop4.price=1554859;
		laptop4.color="red";
		Laptop laptop5=new Laptop();
		laptop5.brand="hp";
		laptop5.price=25850000;
		laptop5.color="yellow";
		Laptop[] laps= {laptop,laptop2,laptop3,laptop4,laptop5};
		//for(int i=0;i<laps.length;i++) {
		//	System.out.println(laps[i].brand);
			
		//}
		//for(int i=0;i<laps.length;i++) {
			//if(i%2==0) {
	//	System.out.println(laps[i].brand);	
		//}}
		long max=0;
		String temp="";
		for(int i=0;i<laps.length;i++) {
			if( laps[i].price<max) {
				//max=laps[i].price;
				temp=laps[i].brand;
				System.out.println(laps[i].price);
			}}
			//System.out.println(max);
			
			//for(int j=0;j<laps.length;j++) {
			 //if(laps[j].price<=max) {
				//System.out.println(laps[j].price);
			//}
		//for(int i=0;i<laps.length;i++) {
		//if(laps[i].price>=laps[i].price) {
	//	}
	//	}
		//System.out.println();
		
	
		//long min=laps[0].price;
	   // Laptop ye=null;
		
		//for(int i=0;i<laps.length;i++) {
		//	if(laps[i].price>=max) {
			//	max = laps[i].price;
		//	max1=laps[i].brand;
		//	}}
		//	System.out.println(max);
	   // for(int i=0;i<laps.length;i++) {
	    //	if(laps[i].price<=min) {
	    	//	min=laps[i].price;
	    		//ye=laps[i];
	    		
			
	    	}

	   // System.out.println(ye.brand+ "  "+ye.price+"  "+ye.color);
	}
	


