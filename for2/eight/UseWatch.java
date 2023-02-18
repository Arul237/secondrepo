package com.onesoft.for2.eight;

public class UseWatch {

	public static void main(String[] args) {
		Watch watch=new Watch();
		watch.brand="titan";
		watch.price=1245;
		watch.color="black";
		watch.rating=7.8f;
		Watch watch2=new Watch();
		watch2.brand="sonata";
		watch2.price=7800;
		watch2.color="silver";
		watch2.rating=7.0f;
		Watch watch3=new Watch();
		watch3.brand="fastrack";
		watch3.price=12800;
		watch3.color="black";
		watch3.rating=8.8f;
		Watch watch4=new Watch();
		watch4.brand="noise";
		watch4.price=124458255;
		watch4.color="gray";
		watch4.rating=6.8f;
		Watch watch5=new Watch();
		watch5.brand="rolwewex";
		watch5.price=145845;
		watch5.color="black";
		watch5.rating=9.8f;
		Watch[] watches= {watch,watch2,watch3,watch4,watch5};
		//int max=watches[0].price;
		//String max1=watches[0].brand;
		int max2=0;
		//String max3=watches[0].color;
		//Watch vivi=null;
		//Watch vive=null;
		//int length=0;
		String a="";
		
		
		for ( Watch ye: watches ) {
		if(ye.price>max2) {
			max2=ye.price;
			a=max2+ye.brand;
		}
		}
		System.out.println(a);
		int max=0;
		String maax2="";
		for(int i=0;i<watches.length;i++) {
			if(watches[i].price>=max) {
				max=watches[i].price;
				maax2=max+watches[i].brand;
			}
		}
		System.out.println(maax2);
		//for(Watch ye:watches) {
		//if(ye.brand.startsWith("s")) {
		//		max=ye.brand.length();
		//		max2=ye.price;
		//	    vivi=ye;
		//	}	}
		//System.out.println(vivi.brand+"  "+max2);
	
	}
}

