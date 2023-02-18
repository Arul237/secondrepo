package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample8 {
	public static void main(String[] args) {
				Biike b1=new Biike("yamaha","yellow",10000,true);
				Biike b2=new Biike("bajaji","brown",2314,false);
				Biike b3=new Biike("tvs","gray",2314,true);
				Biike b4=new Biike("royal enfield","reddith",2314,false);
				ArrayList<Biike> bikes=new ArrayList<>();
				bikes.add(b1);
				bikes.add(b2);
				bikes.add(b3);
				bikes.add(b4);
				int max=0;
				String temp=" ";
				for(Biike x:bikes) {
					if(x.getPrice()>=max) {
						//max=x.getColour().length();
						max=x.getPrice();
						temp=x.getBrand();
						
					}}
					System.out.println(temp);
				System.out.println(max);
			
				}
}
		
		class Biike {
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
			public Biike(String brand,String colour,int price,boolean isAutomatic){
				this.brand=brand;
				this.colour=colour;
				this.price=price;
				
				this.isAutomatic=isAutomatic;
			}
				public String toString() {
					return brand+colour+price+isAutomatic;
			}
		}



