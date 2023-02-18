package com.onesoft.primitivearray.seventh;

public class Enchancedaddmul {

	public static void main(String[] args) {
	int add=0; 
	int add1=0;
	int mul=1;
	int mul1=1;
	int count=0;
	int[] nums={12,25,1,25,15,1,51};
	for(int i=0;i<nums.length;i++) {
		add=add+nums[i];
		mul=mul*nums[i];
		count++;
		
	}
	//System.out.println(add+" "+ add/count);
	//System.out.println(mul+"  "+mul/count);
	for(Integer x:nums) {
		add1=add1+x;
		mul1=mul1*x;
		count++;
	}
	//System.out.println(add1);
	System.out.println(count/2);
	}

}
