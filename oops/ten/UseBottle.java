package com.onesoft.oops.ten;

public class UseBottle {

	public static void main(String[] args) {                                    //encapsulation
		Bottle b1=new Bottle();
		b1.setmaterial("Steel");
		b1.setprice(234);
		b1.setcolor("black");
		b1.setisHeatresistance(true);
        System.out.println(b1.getmaterial()+" "+b1.getprice()+" "+b1.getcolor()+" "+b1.getisHeatresistance());
        Bottle b2=new Bottle();
        b2.setmaterial("plastic");
        b2.setprice(400);
        b2.setcolor("white");
        b2.setisHeatresistance(false);
        System.out.println(b2.getmaterial()+" "+b2.getprice()+" "+b2.getcolor()+" "+b2.getisHeatresistance());
	}

}
class Bottle {
	private String material;
	private int price;
	private  String color;
	private boolean isHeatresistance;
	
	
	public void setmaterial(String material) {// void with parameter
		this.material=material;
	}
	public String getmaterial() {              //return without parameter
	return material;	
	}
	
	
	
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	
	
	
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
	
	
	
	public void setisHeatresistance(boolean isHeatresistance) {
		this.isHeatresistance=isHeatresistance;
	}
	public boolean getisHeatresistance() {
		return isHeatresistance;
	}
}
