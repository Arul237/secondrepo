package com.onesoft.oops.ten;


public class UseCar{
	public static void main (String[] args) {                                         // composition
		Engine en= new Engine();
		en.hp=300;
		en.price=2234;
		en.model="Ford";
		Engine en1=new Engine();
		en1.hp=256;
		en1.price=50000;
		en1.model="mustang";
		
		Car car1=new Car();
		car1.brand="maruthi";
		car1.color="black";
		car1.isDiesel=true;
		car1.price=240000;
		car1.engine=en1;
		System.out.println(car1.brand+" "+car1.color+" "+car1.price+" "+car1.isDiesel+" "+car1.engine.hp+" "+car1.engine.price+" "+car1.engine.model);
		Car car2= new Car();
		car2.brand="Ford";
		car2.color="silver";
		car2.isDiesel=false;
		car2.price=123456;
		car2.engine=en1;
		System.out.println(car2.brand+" "+car2.color+" "+car2.price+" "+car2.isDiesel+" "+car2.engine.hp+" "+car2.engine.price+" "+car2.engine.model);
		Car car3=new Car();
		car3.brand="tata";
		car3.color="white";
		car3.isDiesel=true;
		car3.price=35000;
		car3.engine=en1;
		System.out.println(car3.brand+" "+car3.color+" "+car3.isDiesel+" "+car3.price+" "+car3.engine.hp+" "+car3.engine.price+" "+car3.engine.model);
		
		
		
	}
	
}

 class Car {
String brand;
int price;
String color;
boolean isDiesel;
Engine engine;
}
class Engine{
	int hp;
	int price;
	String model;
	
}

