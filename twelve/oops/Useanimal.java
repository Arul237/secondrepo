package com.onesoft.twelve.oops;

public class Useanimal {
                                                          // abstract
	public static void main(String[] args) {
		Cat ca=new Cat();
		System.out.println(ca.foodType(null));
        System.out.println(ca.sense());
	}

}
 abstract class Animal{
	 

	 public String foodType(String food) {
		 if(food.equalsIgnoreCase("veg")) {
			 return "herb";
		 }
		 else if(food.equalsIgnoreCase("non veg")) {
			 return "car";
		 }
		 else {
			 return "or";
	 }}
	 public String sense() {
		 return "sense";
	 }
	 
 }
 class Cat extends Animal{
	 public String animalType(boolean isPet) {
		 if(isPet==true) {
			 return "vasv";
		 }
		 else {
			 return "fvf";
		 }
		 }
	 }
 
