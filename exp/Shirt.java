package com.onesoft.exp;

public class Shirt {
	String brand="";
public static void main(String[] args) throws BrandNotFound{
	Shirt s1=new Shirt();
	s1.brand="alley";
	Shirt s2=new Shirt();
	s2.brand="selly";
	Shirt s3=new Shirt();
	s3.brand="polo";
	Shirt[] shirts= {s1,s2,s3};
	try {
		for(Shirt x:shirts) {
		if(x.brand.equalsIgnoreCase("selly")) {
		System.out.println("match");
		throw new BrandNotFound("match");
	}
		else{
			System.out.println("not match");
		
		}
}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}

