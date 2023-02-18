package com.onesoft.twelve.oops;

public class UseDeveloperr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 interface Human {
	 public String eat(int time) {
	 if(time<7 && time>10) {
		 return "breakfast";
	 }
	 else  if(time<12 && time>15) {
		 return "lunch";
	 }
	 else  if(time<19 && time>22) {
		 return "dinner";
	 }
	 else {
		 return "snack time";
	 }
	 }
	 public String sleep( ) { 
	 return "sleep ";
	 }
	 public String work() {
	 return "work 10 hoursdays";
	 }
 }
 
 
 
 
 
 
 
 
 
 
abstract class Itemployee implements Human {
	 public abstract String eat(int time);
	 public abstract String sleep( );
	 public abstract String work();
	 public  int findSalary(String designation) {
		
			 if(designation.equalsIgnoreCase("hr")) {
				 return 75000;
			 }
			 else  if(designation.equalsIgnoreCase("tl")) {
				 return 55000;
			 }
			 else  if(designation.equalsIgnoreCase("developer")) {
				 return 35000;
			 }
			 else {
				 return 25000;
			 }
			 }
	 }
 
class JavaDeveloper extends Itemployee {
	public  String fullStackDeveloper(boolean isFrontend) {
	 if(isFrontend==true) {
		 return "full stack developer";
	 }
	 else  if(isFrontend==false) {
		 return "full stack developer";
	 }
}}
