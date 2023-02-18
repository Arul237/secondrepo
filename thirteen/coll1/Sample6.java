package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample6 {

	public static void main(String[] args) {
		ArrayList<String> pens =new ArrayList<> ();
        pens.add("apasara");
        pens.add("natraj");
        pens.add("flair");
        String temp=" ";
        for(int i=0;i<pens.size();i++) {
        	//temp=temp+pens.get(i);
        
        System.out.println(pens.get(i));
	}}

}
class Pen{
	String brand;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return  brand;
	}

public Pen(String brand) {
	this.brand=brand;
}
	public String toString() {
		return brand;
	}
}
