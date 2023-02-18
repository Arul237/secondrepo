package com.onesoft.second;

public class Usehomework {
public static void main(String[] args) {
	Homework usehome= new Homework();
	usehome.Brand="HP";
	usehome.color="SILVER";
	usehome.price=45000;
	usehome.waterproof="ItWaterproof";
	usehome.cameramp=5;
	usehome.tax=20;
	usehome.processor="QUALCOMM";
	usehome.ram=4;
	usehome.rom=512;
	usehome.total=usehome.price+(usehome.price*usehome.tax/100);
	System.out.println("Brand = "+usehome.Brand+" "+"color = "+usehome.color+" "+"Total = "+usehome.total +" "+usehome.waterproof+" "+"Processor = " + usehome.processor+" "+"Ram = "+usehome.ram+" "+"Rom = "+usehome.rom);
	int max=0;
}
}
