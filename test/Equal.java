package com.onesoft.test;

public class Equal {
public static void main(String[] args) {
	String name="Army";                  // 5
	String name2= "girl";
	boolean nma=name.equals(name2);
	System.out.println(nma);

	
	String word="wonder Land";           //6
	boolean words=word.equalsIgnoreCase("wonder");
	System.out.println(words);
	
	String value="java,PYTHON,C++";      //7
	String[] dra=value.split(",");
	System.out.println(dra[0]);
	System.out.println(dra[1]);
	System.out.println(dra[2]);
	int val=dra[0].length();
	System.out.println(val);
	int val2=dra[1].length();
	System.out.println(val2);
	int val3=dra[2].length();
	System.out.println(val3);
	String a=dra[1].toLowerCase();
	System.out.println(a);
	
	String nri="values";                    //8
	char[] na=nri.toCharArray();
	System.out.println("the array value of count" +na[0]);
	
	String samart="Fantacy program";        //9
	boolean ins=samart.endsWith("s");
	System.out.println("its end with = "+ins);
	boolean inr=samart.startsWith("f");
	System.out.println("the start with value = "+inr);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
