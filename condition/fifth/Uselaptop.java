package com.onesoft.condition.fifth;

public class Uselaptop {
public static void main(String[] args) {
	Laptop var=new Laptop();
	var.brand="dell";
	var.price=22000;
	var.ram=4;
	var.isIntelcore=true;
	Laptop var2=new Laptop();
	var2.brand="hp";
	var2.price=45000;
	var2.ram=4;
	var2.isIntelcore=true;
	Laptop var3=new Laptop();
	var3.brand="lenovo";
	var3.price=60000;
	var3.ram=4;
	var3.isIntelcore=false;
	if (var.price>var2.price && var.price>var3.price) {
		System.out.println(var.brand);
		
	}
	else if (var2.price>var3.price && var2.price>var.price) {
		System.out.println(var2.brand+"  is higher");
	}
	else {
		System.out.println(var3.brand+"is higher");
	}
	
	
}
}
