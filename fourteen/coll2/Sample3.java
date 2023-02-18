package com.onesoft.fourteen.coll2;

import java.util.HashMap;

public class Sample3 {

	public static void main(String[] args) {
		HashMap <Integer , String> lms=new HashMap<>();
		lms.put(508, "viji");
		lms.put(1046, "petchi");
		lms.put(1044, "gopi");
		lms.put(1038, "sindhu");
		lms.put(1039, "balaji");
		lms.put(1041, "lakshmi");
		lms.put(1025, "vetri");
		lms.put(1021, "franklin");
		lms.put(1042, "sowmiya");
		lms.put(1048, "Arul");
		lms.put(541, "vetri");
		lms.forEach((x,y) -> System.out.println(x+" "+y));

	}

}
