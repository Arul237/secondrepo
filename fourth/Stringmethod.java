package com.onesoft.fourth;

public class Stringmethod {
public static void main(String[] args) {
	String a=args[0];
	String b=args[1];
	boolean c=a.equals(b);
	System.out.println("this is equal or not = "+c);
	
	boolean d=a.equalsIgnoreCase(b);
	System.out.println("the ignorecase = "+d);
	
	String e=a.toUpperCase();
	System.out.println("the touppercase = "+e);
	
	String f=a.toLowerCase();
	System.out.println("the lower case = "+f);
	
	String g=a.concat(b);
	System.out.println("added the string value = "+ g);
	
	String h=a.substring(3);
	System.out.println("the substring method = "+ h);
	
	int i=a.charAt(2);
	System.out.println("the charAt value = "+ i);
	
	boolean j=a.startsWith("e");
	System.out.println("the startwith = "+ j);
	
	boolean k=a.endsWith("f");
	System.out.println("the endsWith function = "+ k);
	
	boolean l=a.contains("h");
	System.out.println("the contain value is = "+l);
	
	int po=a.length();
	System.out.println("the lenght value = "+ po);
	
	String[] r=a.split("w");
	System.out.println("the split value = "+r[0]);
	
	char[] qwe=a.toCharArray();
	System.out.println("the tochararray = "+qwe[3]);
	
	int l2name=a.indexOf('w');//welcome of string =  words count start with 0123456 its using single or double quotes
	System.out.println("the identify the letter count"+l2name);
	
	
	
	
	
	
}
}
