package com.onesoft.fourteen.coll2;

import java.util.HashMap;

public class Sample4 {
public static void main(String[] args) {
	HashMap <Long,String> lms=new HashMap<>();
	lms.put(8110053800l, "Arul");
	lms.put(8098510704l, "sakthi");
	lms.put(8072760789l, "Arulshiva");
	lms.put(9843750984l, "dinesh");
	//for(Long x:lms.keySet()) {
		//System.out.println(x);
		
	//}
	System.out.println(" ");
	for (Long y:lms.keySet()) {
		System.out.println(lms.keySet());
	}
	//System.out.println(" ");
	//for (Long z:lms.keySet()) {
	//	System.out.println(lms.get(z));
	//}
	System.out.println(" ");
	for (String u:lms.values()) {
		if(u.contains("a") ||u.contains("u") ||u.contains("i") ||u.contains("o")||u.contains("e")  ) {
			System.out.println(u);
		}
	}
}
}
