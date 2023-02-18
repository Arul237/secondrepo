package com.onesoft.exp;

public class Findindexposition {

	public static void main(String[] args) {
		String a="arul";
		try {
			int c=a.charAt(5);
			System.out.println(c);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("invalid");
		}
	}

}
