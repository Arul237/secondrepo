package com.onesoft.exp;

public class Customesexp {
	
	public static void main(String[] args)throws Exception {
		
		Car c1=new Car();
		c1.brand="Honda";
		Car c2=new Car();
		c2.brand="Mahindra";
		Car c3=new Car();
		c3.brand="Toyota";
		boolean isAvail=false;
		Car[] cars= {c1,c2,c3};
		
			for(Car x: cars) {
				if(x.brand.contains("ferrari")) {
				isAvail=true;
				}
			}
			
				if (isAvail==true) {
					System.out.println("availble");
				}
				else {
					throw new Exception("Not avail");
			}
		
	}

}
class Car {
	String brand;
}

