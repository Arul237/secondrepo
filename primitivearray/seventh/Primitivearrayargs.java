package com.onesoft.primitivearray.seventh;

public class Primitivearrayargs {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
	    int f=Integer.parseInt(args[5]);
	    int[] nums= {a,b,c,d,e,f};
	    for(int i=0;i<nums.length;i++) {
	    	//System.out.println("run value"+nums[i]);
	    	if(nums[i]%2==0) {
	    		System.out.println("even value "+nums[i]);
	    	}
	    	else {
	    		System.out.println("odd value "+nums[i]);
	    	}
	    }
	}

}
