package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample5 {

	public static void main(String[] args) {
		Bikee b1=new Bikee("yamaha","yellow",100000,true);
		Bikee b2=new Bikee("bajaji","yellow",2314,true);
		ArrayList<Bikee> bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		for(Bikee x:bikes) {
		//for(int i=0;i<bikes.length;i++) {
		if(x.getPrice()>= 5000) {
			
				System.out.println(x.getPrice()+"is greater than 12000");
			
		}
	}
		}

}
class Bikee {
	String brand;
	int price;
	String colour; 
	boolean isAutomatic;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return  brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return  price;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return  colour;
	}
	public void setIsAutomatic(boolean isAutomatic) {
		this.isAutomatic=isAutomatic;
	}
	public boolean getIsAutomatic() {
		return  isAutomatic;
	}
	public Bikee(String brand,String colour,int price,boolean isAutomatic){
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.isAutomatic=isAutomatic;
	}
		public String toString() {
			return brand+price+colour+isAutomatic;
	}
}