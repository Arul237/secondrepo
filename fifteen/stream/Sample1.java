package com.onesoft.fifteen.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {

	public static void main(String[] args) {
		ArrayList <Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(123);
        nums.add(572);
        nums.add(267);
        nums.add(526);
                                 
                                 // collect the values(method)
                              // Collectors = class
                                 // to list its depends upon storage area list or map or toSet
                            // toList() , toMap(), toSet() Collectors method
        nums.stream().filter(y -> y%2==0).forEach(y->System.out.println(y));
      //filter=condition
       Long a= nums.stream().filter(y -> y%2==0).count();
        System.out.println(a);
        
	List<Integer> n=nums.stream().filter(x-> x%2==0).collect(Collectors.toList());// store to use list or set or map using collect() method
	System.out.println(n);
	Long m=nums.stream().filter(z->z%2!=0).count();// condition used to count the odd no of values
	System.out.println(m);// store to only Long datatype
	
	
	
	}

}
