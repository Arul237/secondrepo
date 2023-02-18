package com.onesoft.second;

public class Usemobile {
public static void main(String[] args) {
	Mobile mobiledetail= new Mobile();
	mobiledetail.brand="vivo";
	mobiledetail.color="black";
	mobiledetail.iswarranty=true;
	mobiledetail.ram=6;
	mobiledetail.price=12504;
	Mobile mobiledetail2= new Mobile();
	mobiledetail2.brand="oppo";
	mobiledetail2.color="white";
	mobiledetail2.iswarranty=true;
	mobiledetail2.ram=6;
	mobiledetail2.price=12542;
	Mobile mobiledetail3= new Mobile();
	mobiledetail3.brand="redmi";
	mobiledetail3.color="blue";
	mobiledetail3.iswarranty=true;
	mobiledetail3.ram=6;
	mobiledetail3.price=10000;
	System.out.println("brand="+mobiledetail.brand +" "+"price=" +mobiledetail.price +" "+"color="+mobiledetail.color+" "+"ram="+mobiledetail.ram+" "+"iswarranty"+mobiledetail.iswarranty);
	System.out.println("brand="+mobiledetail2.brand +" "+"price=" +mobiledetail2.price +" "+"color="+mobiledetail2.color+" "+"ram="+mobiledetail2.ram+" "+"iswarranty"+mobiledetail2.iswarranty);
	System.out.println("brand="+mobiledetail3.brand +" "+"price=" +mobiledetail3.price +" "+"color="+mobiledetail3.color+" "+"ram="+mobiledetail3.ram+" "+"iswarranty"+mobiledetail3.iswarranty);
	int max=1;
	Mobile[] mobiles= {mobiledetail,mobiledetail2,mobiledetail3};
	for(int i=0;i<mobiles.length;i++) {
		if(mobiles[i].price>=max) {
			max=mobiles[i].price;
			}
			System.out.println(mobiles[i].brand);
	}
	
}
}
