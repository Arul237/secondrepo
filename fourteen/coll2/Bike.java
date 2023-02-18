package com.onesoft.fourteen.coll2;

public class Bike {
private String brand;
private int price;
private String color;
private int registerno;
public  Bike(String brand,int price,String color,int registerno) {
	this.brand = brand;
	this.price = price;
	this.color =color;
	this.registerno = registerno;
	
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getRegisterno() {
	return registerno;
}
public void setRegisterno(int registerno) {
	this.registerno = registerno;
}


public String toString() {
	return  brand +  price +  color +  registerno ;
}

}
