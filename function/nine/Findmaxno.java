package com.onesoft.function.nine;

public class Findmaxno {
public String findmax(int[] a) {
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>=max) {
			max=a[i];
		}                                    // return with parameter
	}
	return "maximum is" +max;
}
	public void findma(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min) {
				min=a[i];                   // void with parameter
			}
		}
		System.out.println(min);
}
}
