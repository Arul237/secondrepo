package com.onesoft.fourteen.coll2;

import java.util.HashMap;
import java.util.Iterator;

public class Sample6 {
	public static void main(String[] args) {
		Bike bike1=new Bike("yamaha",12444,"black",2531);
		Bike bike2=new Bike("bajaji",1244,"yellow",2633);
		Bike bike3=new Bike("tvs",1244,"green",2474);
		Bike bike4=new Bike("yamaha",1444,"red",2834);	
		HashMap<Integer,Bike> bikes=new HashMap<>();
		bikes.put(bike1.getRegisterno(), bike1);
		bikes.put(bike2.getRegisterno(), bike2);
		bikes.put(bike3.getRegisterno(), bike3);
		bikes.put(bike4.getRegisterno(), bike4);
		//Iterator <Integer> it=bikes.keySet().iterator();
		//while(it.hasNext()) {
		for(Bike x:bikes.keySet())
			if(x.getPrice()%2==0) {
				//x.remove();
				//System.out.println(it.next());
			}
		}
		//System.out.println(bikes);
		bikes.forEach((x,y) ->System.out.println(y.getBrand()));
}}
