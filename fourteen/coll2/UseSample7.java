package com.onesoft.fourteen.coll2;

import java.util.HashMap;

public class UseSample7 {

	public static void main(String[] args) {
		State s1=new State("tamilnadu","tn","chennai","tamil");
		State s2=new State("kerala","kl","thiruvanthapuram","malayyalam");
		State s3=new State("karnataka","ka","bengalure","kanada");
		State s4=new State("telugana","tl","hyderabad","telugu");
		HashMap<String ,State> states=new HashMap<>();
		states.put(s1.getCode(), s1);
		states.put(s2.getCode(), s2);
		states.put(s3.getCode(), s3);
		states.put(s4.getCode(), s4);
		State[] States ={s1,s2,s3,s4};
		for(String x:states.keySet()) {
		System.out.println(x );
		}
		System.out.println(states.values());
	}

}
