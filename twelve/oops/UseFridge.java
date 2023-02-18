package com.onesoft.twelve.oops;

public class UseFridge {                                     // abstract
public static void main(String[] args) {
	Fridge fr=new Fridge();
	fr.onOff(false);
	System.out.println(fr.usage());
}
}
abstract class Electronic{
	public void onOff(boolean isOn) {
		if(isOn==true) {
		System.out.println("it is working");
	}
		else {
			System.out.println("its not working");
		}
	}
	public abstract String usage();
}
class Fridge extends Electronic{
	public String usage(){
		return "fridge";
	}
}

