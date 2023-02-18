package com.onesoft.fourteen.coll2;

import java.util.HashMap;

public class UseBike {

	public static void main(String[] args) {
	Bike bike1=new Bike("yamaha",12444,"black",2534);
	Bike bike2=new Bike("bajaji",1244,"yellow",2634);
	Bike bike3=new Bike("tvs",1244,"green",2474);
	Bike bike4=new Bike("yamaha",1444,"red",2833);	
	HashMap<Integer,Bike> bikes=new HashMap<>();
	bikes.put(bike1.getRegisterno(), bike1);
	bikes.put(bike2.getRegisterno(), bike2);
	bikes.put(bike3.getRegisterno(), bike3);
	bikes.put(bike4.getRegisterno(), bike4);
    System.out.println(bikes.values());
	//System.out.println(bikes.keySet());
	//System.out.println(bikes.get(bikes));
	for(Bike x:bikes.values()) {
		System.out.println(x);
		
	}
	for(Integer y:bikes.keySet()) {
		System.out.println(bikes.get(y));
	}
	for (Integer z:bikes.keySet()) {
		System.out.println(bikes.get(z));
	}System.out.println("********");
	for(Integer r:bikes.keySet()) {
		if(r%2!=0) {
			System.out.println(bikes.get(r).getBrand());
		}
	}
	
	}

}
