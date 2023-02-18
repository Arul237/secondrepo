package com.onesoft.oops.ten;

public class UseLaptop {

	public static void main(String[] args) {                                                 //constructor
	Laptop laps1=new Laptop("Hp",35000,8,false);
	Laptop laps2=new Laptop("dell",4500,16,true);
	//System.out.println(laps1.brand+" "+laps1.price+" "+laps1.ram+" "+laps1.isTouchScreen+" "+laps1);
	//System.out.println(laps2.brand+" "+laps2.price+" "+laps2.ram+" "+laps2.isTouchScreen+" "+laps2);
      System.out.println(laps1);
      System.out.println(laps2);
	}
	

}
 class Laptop {
private	String brand;
private	int price;  
private	int ram;
private	boolean isTouchScreen;
	public Laptop(String brand,int price,int ram,boolean isTouchScreen) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.isTouchScreen=isTouchScreen;
	}
	public String toString() {                                                            // String toString method
	return "Brand="+brand+" Price="+price+" ram= "+ram+" isTouchscreen="+isTouchScreen;    // refernce value call the information
	
}}