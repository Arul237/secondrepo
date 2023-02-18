package com.onesoft.fourth;

public class Uselaptop {
public static void main(String[] args) {
	Laptop use1=new Laptop();
	String[] a=args[0].split(",");
	use1.brand=a[0];
	use1.price=Integer.parseInt(a[1]);
	use1.color=a[2];
	use1.istouch=Boolean.parseBoolean(a[2]);
	System.out.println(use1.brand);
	System.out.println(use1.price);
	System.out.println(use1.color);
	System.out.println(use1.istouch);
	System.out.println();
	Laptop use2=new Laptop();
	String[] e=args[1].split(",");
	use2.brand=e[0];
	use2.price=Integer.parseInt(e[1]);
	use2.color=e[2];
	use2.istouch=Boolean.parseBoolean(e[3]);
	System.out.println(use2.brand);
	System.out.println(use2.price);
	System.out.println(use2.color);
	System.out.println(use2.istouch);
	System.out.println();
	Laptop use3=new Laptop();
     String[] s=args[2].split(",");
     use3.brand=s[0];
     use3.price=Integer.parseInt(s[1]);
     use3.color=s[2];
     use3.istouch=Boolean.parseBoolean(s[3]);
     System.out.println(use3.brand);
     System.out.println(use3.price);
     System.out.println(use3.color);
     System.out.println(use3.istouch);
     
     
	
	
	
}
}
