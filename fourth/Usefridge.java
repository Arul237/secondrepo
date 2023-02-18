package com.onesoft.fourth;

public class Usefridge {
public static void main(String[] args) {
	Fridge use1=new Fridge();
	String[] d=args[0].split("@");
	use1.brand = d[0];
	use1.price=Integer.parseInt(d[2]);
	use1.isdoubledoor=Boolean.parseBoolean(d[1]);

	use1.discount=Integer.parseInt(d[3]);
	
	use1.tax=Integer.parseInt(d[4]);
	use1.netprice=use1.price+(use1.price*use1.tax/100);
	System.out.println("the value" +use1.netprice);
	System.out.println(use1.brand + use1.price );
	
	
	
}
}
