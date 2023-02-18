package com.onesoft.primitivearray.seventh;

public class Maxmiumnumber {

	public static void main(String[] args) {
		int[] nums= {15,32,35,21,52,25};
		int max=0;
		int mini=nums[0];
		for(int i=0;i<nums.length;i++) {
		if(nums[i]<=mini) {
			mini=nums[i];
		}
		else if (nums[i]>max) {
			max=nums[i];
		}
		else {
			System.out.println("");
		}
		}
		System.out.println(max);
		System.out.println(mini);
	}

}
