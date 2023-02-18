package com.onesoft.twelve.oops;

public class Usenumber {

	public static void main(String[] args) {
		

	}

}
interface NumberPlate{
	public String displaynumberPlate();
	public String display(String country);
}
abstract Centralgovernment implements NumberPlate{
	public  String displayStatecode(String state) {
	return "IND"+ state;
	}
	public  String displaynumberPlate(String displaynumberPlate) {
		return "horizontal";
	}
	public String display1(String country) {
		return "INDIA"+country;
}} 
class Tamilnadu extends Centralgovernment{
	public String displayVehicle(int number) {
		return 3312;
	}
}