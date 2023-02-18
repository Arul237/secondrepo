package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample3 {
public static void main(String[] args) {
			ArrayList<Integer> ages=new ArrayList<> ();
			ages.add(28);
			ages.add(27);
			ages.add(27);
			ages.add(29);
			ages.add(22);
			ages.add(25);
			ages.add(25);
			ages.add(26);
			ages.add(24);
			ages.add(26);
			ages.remove(5);                                   
			ages.set(6, 16);  
			ages.forEach (x-> System.out.println(x) );
}}

