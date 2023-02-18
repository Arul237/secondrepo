package com.onesoft.oops.ten;

public class UseMobile {

	public static void main(String[] args) {                                //composition
	
		Processor p1=new Processor();
		p1.brand="Intel";
		p1.price=2389;
		p1.model="Qualcomm";
		Processor p2=new Processor();
		p2.brand="hp";
		p2.price=345;
		p2.model="nvidia";
		Processor p3=new Processor();
		p3.brand="tec";
		p3.price=258;
		p3.model="geforce";
		
		Mobile mobile1= new Mobile();
		mobile1.brand="vivo";
		mobile1.ram=6;
		mobile1.isAndroid=true;
		mobile1.processor=p1;
		System.out.println(mobile1.brand+" "+mobile1.ram+" "+mobile1.isAndroid+" "+mobile1.processor.brand+" "+mobile1.processor.price+" "+mobile1.processor.model);
		Mobile mobile2=new Mobile();
		mobile2.brand="realme";
		mobile2.ram=4;
		mobile2.isAndroid=false;
		mobile2.processor=p2;
		System.out.println(mobile2.brand+" "+mobile2.ram+" "+mobile2.isAndroid+" "+mobile2.processor.brand+" "+mobile2.processor.price+" "+mobile2.processor.model);
		Mobile mobile3=new Mobile();
		mobile3.brand="apple";
		mobile3.ram=4;
		mobile3.isAndroid=true;
		mobile3.processor=p3;
		System.out.println(mobile3.brand+" "+mobile3.ram+" "+mobile3.isAndroid+" "+mobile3.processor.brand+" "+mobile3.processor.price+" "+mobile3.processor.model);
		
		
	}
		
		
		

	}
	class Mobile{
		String brand;
		int ram;
		boolean isAndroid;
		Processor processor;
		
	}
	class Processor{
		String brand;
		int price;
		String model;
	}


