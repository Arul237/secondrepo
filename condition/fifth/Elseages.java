package com.onesoft.condition.fifth;

public class Elseages {

	public static void main(String[] args) {
		int var=48;
		if(var>12&& var<=0) {
			System.out.println(var+ " kid");
		}
		else if(var>13&& var<=19) {
			System.out.println(var+ " is teen");
		}
		else if(var>20&& var<=45)  {
			System.out.println(var+" is adult");
		}
		else {
			System.out.println(var+ " senior citizen");
		}
	}

}
