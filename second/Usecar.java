package com.onesoft.second;

public class Usecar {
public static void main(String[] args) {
	Car cardetail=new Car();
	cardetail.brand="maruthi";
	cardetail.price=50000;
	cardetail.istubeless=true;
	cardetail.taxamount=5000;
	cardetail.netprice=cardetail.price+cardetail.taxamount;
	
	System.out.println("Brand="+" "+cardetail.brand+" "+"Netprice"+" "+cardetail.netprice);
	Car cardetail2=new Car();
	cardetail2.brand="volvo";
	cardetail2.price=50000;
	cardetail2.istubeless=true;
	cardetail2.taxamount=5000;
	cardetail2.netprice=cardetail2.price+cardetail2.taxamount;
	System.out.println("Brand="+" "+cardetail2.brand+" "+"Netprice"+" "+cardetail2.netprice);
	
	
	
}
}
