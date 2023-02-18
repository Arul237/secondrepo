package com.onesoft.second;

public class Usefridge {
public static void main(String[] args) {
	Fridge fridge=new Fridge();
	fridge.brand="lg";
	fridge.price=10000;
	fridge.model=2012;
	fridge.isDoubleDoor=true;
	fridge.taxpercentage=12;
	fridge.taxamount=fridge.price*fridge.taxpercentage/100;
	fridge.discountpercentage=8;
	fridge.discountamount=fridge.price*fridge.discountpercentage/100;
	fridge.netprice=fridge.price-fridge.discountamount+fridge.taxamount;
	System.out.println("Brand= "+ fridge.brand+" Model = "+fridge.model+ " isdoubleDoor = "+ fridge.isDoubleDoor+" netprice="+fridge.netprice);
	Fridge fridge1=new Fridge();
	fridge1.brand="Samsung";
	fridge1.price=10000;
	fridge1.model=2016;
	fridge1.isDoubleDoor=true;
	fridge1.taxpercentage=12;
	fridge1.taxamount=fridge1.price*fridge1.taxpercentage/100;
	fridge1.discountpercentage=8;
	fridge1.discountamount=fridge1.price*fridge1.discountpercentage/100;
	fridge1.netprice=fridge1.price-fridge1.discountamount+fridge1.taxamount;
	System.out.println("Brand= "+ fridge1.brand+" Model = "+fridge1.model+ " isdoubleDoor = "+fridge1.isDoubleDoor+" netprice="+fridge1.netprice);
}
}
