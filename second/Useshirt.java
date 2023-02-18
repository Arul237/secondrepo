package com.onesoft.second;

public class Useshirt {
public static void main(String[] args) {
	Shirt useshirt=new Shirt();
	 useshirt.brand="otto";
	 useshirt.price=1000;
	 useshirt.size=45;
	 useshirt.ischecked=true;
	 useshirt.discount=20;
	 useshirt.netprice=useshirt.price-(useshirt.price*useshirt.discount/100);
	 System.out.println("Brand ="+" "+ useshirt.brand +" "+" Netprice = "+useshirt.netprice);
	 Shirt useshirt1=new Shirt();
	 useshirt1.brand="PeterEngland";
	 useshirt1.price=1900;
	 useshirt1.size=45;
	 useshirt1.ischecked=true;
	 useshirt1.discount=20;
	 useshirt1.netprice=useshirt1.price-(useshirt1.price*useshirt1.discount/100);
	 System.out.println("Brand ="+" "+ useshirt1.brand +" "+" Netprice = "+useshirt1.netprice);
	
}
}
