package com.onesoft.fourteen.coll2;

import java.util.HashMap;
import java.util.Iterator;

public class Sample1 {
public static void main (String[] args) {
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
	//System.out.println(lms);
	//System.out.println(lms.keySet());
	//System.out.println(lms.values());
	
	Iterator <Integer> it=lms.keySet().iterator();
	while(it.hasNext()) {
		if(lms.values().equals("vetri"))
		System.out.println(it.next());
	}
	Iterator <String> iit=lms.values().iterator();
	while(iit.hasNext()) {
	//	System.out.println(iit.next());
    }System.out.println(" "); 
	//Iterator<String> et=lms.values().iterator();
	//while(et.hasNext()) {
	//	if(et.next().startsWith("s")) {
	//		System.out.println(et.next());
	//	}
	//}
}}
