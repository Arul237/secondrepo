package com.onesoft.second;

public class Usebook {
public static void main(String[] args) {
	Book useboo = new Book();
	useboo.book="author";
	useboo.price=1250;
	useboo.totalpage=1256;
	useboo.discount=20;
	useboo.readedpage=20;
	useboo.balancepage=useboo.totalpage-(useboo.totalpage*useboo.readedpage/100);
	useboo.netprice=useboo.price-(useboo.price*useboo.discount/100);
	System.out.println("Book = "+useboo.book+" totalpage"+useboo.totalpage+" "+"Readpage = "+useboo.readedpage+"%"+" "+"cannotreadpage "+useboo.balancepage);
    System.out.println("Netprice = "+useboo.netprice);
}
	
	
	
	
	
	
	
	
	
}
