package com.onesoft.primitivearray.seventh;

public class VowelStringnamecount {

	public static void main(String[] args) {
		String[] names= {"vijj","gopi","names","arul","petchi","gft"};
		int count=0; int count1=0;
		
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("u")||names[i].contains("o")) {
				count++;
				
			}
			else {
				count1++;
				
			}
		}
			System.out.println(count);
			
		System.out.println(count1);
		
		}
	}


