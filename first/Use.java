package com.onesoft.first;
public class Use {
	public static void main(String[] args) {
		
	
	String[] a=args[0].split(",");
	Vowel vrr=new Vowel();
	String var=a[0].toUpperCase();
	vrr.model=var;
	char rdd=var.charAt(1);
	int b=Integer.parseInt(a[1]);
	vrr.data=b;
	boolean c=Boolean.parseBoolean(a[2]);
	vrr.ans=c;
	
	System.out.println(var+"   "+b+"   "+c+"    "+rdd);
	
}
}