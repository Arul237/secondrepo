package com.onesoft.third;

public class Total {
	public static void main(String[] args) {
//CONCAT		
		String name="welcome to string";	//String name ; first types of concat type                                      
		String lname=name.concat(" arul");// another type of concat
		System.out.println(lname);
//ENDSWITH
		String end="welcome to string";
		boolean endswithi=end.endsWith("ing");
		boolean lendswithi=end.endsWith("ING");
		System.out.println(endswithi);//its 1
		System.out.println(lendswithi);
//EQUAL
		String EQUAL="welcome to string";
		String equal="WELCOME to string";
		boolean isequal=EQUAL.equals(equal);// call from name and lname is equal function
		System.out.println(isequal);
//LAST LETTER FIND
		String last="kctfolcvlk";
		int lastfind=last.length();// counting value in int so i have use to int datatype
		char lastfnd=last.charAt(lastfind-1);// add to value 2 data.
		System.out.println(lastfnd);
//LOWWERCASE
		String lower="WELCOME to java";
		String lowercase=lower.toLowerCase();
		System.out.println( "the lowercase"+lowercase); //its count total value of space include to count
//split	THE DATA
		String split="apple orange banana";
		String[] values=split.split(" ");
		System.out.println(values[2]);
		int value=name.length();// only count the elements in array
		System.out.println(value);
		int valuew=values.length;
		System.out.println(valuew);
//STARTS WITH LETTER TYPE
		String startingletter="welcome to string";
		boolean start=startingletter.startsWith("we");//its start with check  compare lower or upper case 
		System.out.println(start);// its check first common letters
//FIND LENGHT 
		int iname=name.length();
		System.out.println("the name lenght= "+iname);
//chatAt of
		char words=name.charAt(12);//welcome of string = 01234566 words count start with 0123456
		System.out.println("identify the letters of words" + words);
//indexOf
		int l2name=name.indexOf(' ');//welcome of string =  words count start with 0123456 its using single or double quotes
		System.out.println(l2name);//
//contain the data
		String intro ="welcome to string";
		boolean ax=intro.contains("we");
		System.out.println(ax);
		boolean valuet=intro.contains("WE");
		System.out.println(valuet);
		boolean l3name=intro.contains("string");
		System.out.println(l3name);
		boolean l4name=intro.contains("welome");
		System.out.println(l4name);
		
		
	}

}
