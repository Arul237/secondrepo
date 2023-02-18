package com.onesoft.exp;

public class Filenotfoundex {
	
	    public static void main(String[] args) throws    ClassNotFoundException{
	        try {
	            Class.forName("Arul");
	         
	        } catch (ClassNotFoundException e) {
	        	   throw new ClassNotFoundException("class not found");
	           // System.out.println("Class not found: " + e.getMessage());
	        }
	    }
	}
class Arul {
	
}
