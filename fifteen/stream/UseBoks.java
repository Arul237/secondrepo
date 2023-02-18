package com.onesoft.fifteen.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseBoks {

	public static void main(String[] args) {
		Boks b1=new Boks(102,"chandalika","radindranath tagor",450,2000);
        Boks b2=new Boks(234,"my dods decree","kapil dev",375,2010);
        Boks b3=new Boks(57,"Bike","hero",375,2012);
        Boks b4=new Boks(24,"car","owner",390,2013);
        Boks b5=new Boks(85,"laptop","device",4575,2017);
        Boks b6=new Boks(954,"scare","human",5000,2019);
        Boks b7=new Boks(274,"weird","animal",6000,2010);
        HashMap<Integer,Boks> books=new HashMap<>();
        books.put(102, b1);
        books.put(234, b2);
        books.put(57, b3);
        books.put(24, b4);
        books.put(85, b5);
        books.put(954, b6);
        books.put(274, b7);
        books.forEach((x,y) -> System.out.println(y));
        System.out.println("  ");
        books.values().stream().filter(x->x.getPrice()>=2000).forEach(x -> System.out.println(x));
        System.out.println(" ");
        
        
        List<Boks> t=books.values().stream().filter(w->w.getPrice()>=2000).collect(Collectors.toList());// can't accept the sysout it is a collect the values 
        System.out.println(t);
        System.out.println(" ");
        try {
			Thread.sleep(4678);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        Map<Integer,Boks> y=books.values().stream().filter(i->i.getEdition()>=2015).collect(Collectors.toMap(e->e.getId(), g->g ) );// map using collect used so c
        System.out.println(y);
        
	}

}
