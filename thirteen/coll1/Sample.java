package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample {
	

		public static void main(String[] args) {
			Bike b1=new Bike("yamaha","yellow",10000,true);
			Bike b2=new Bike("bajaji","yellow",2314,false);
			Bike b3=new Bike("tvs","yellow",2314,true);
			Bike b4=new Bike("royal enfield","yellow",2314,false);
			ArrayList<Bike> bikes=new ArrayList<>();
			bikes.add(b1);
			bikes.add(b2);
			bikes.add(b3);
			bikes.add(b4);
			for(Bike xy:bikes) {
				if(xy.isAutomatic==true &&  xy.colour=="yellow") {
					System.out.println(xy);
				}
			
			
		
			}}

	}
	class Bike {
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
		public Bike(String brand,String colour,int price,boolean isAutomatic){
			this.brand=brand;
			this.colour=colour;
			this.price=price;
			
			this.isAutomatic=isAutomatic;
		}
			public String toString() {
				return brand+colour+price+isAutomatic;
		}
	}

