 package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Arul");
		names.add("gopi");
		names.add("Arun");
		names.add("Balaji");
		names.add("peychi");
		names.add("vetri");
		names.add("lakshmipathi");
		names.add("sowmiya");
		names.add("sindhu");
		//names.remove(5);                        // remove the value
		names.set(3, "Dear");                  // alternate the value using set keyword
		for(String x:names) {
			System.out.println(x);
			
		}
		System.out.println("    ");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		

	}

}
