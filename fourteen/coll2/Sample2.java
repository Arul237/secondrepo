package com.onesoft.fourteen.coll2;

import java.util.HashMap;

public class Sample2 {

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
		for(Integer x:lms.keySet()) { // call key
			System.out.println(lms.values());
		}
		for (String y:lms.values()) {  // call value
			System.out.println(y);
		}System.out.println("*************");
		for(Integer x:lms.keySet()) {          //key using call value
			System.out.println(lms.get(x));
		}

	}

}
