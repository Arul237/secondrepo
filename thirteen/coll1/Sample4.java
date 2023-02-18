package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample4 {
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
		//names.set(3, "Dear");       
		names.forEach(x-> { if(x.startsWith("s")) {System.out.println(x);
		}
		else {
			System.out.println("invalid");
		}

		
	});
		}
		
		
	}
	

