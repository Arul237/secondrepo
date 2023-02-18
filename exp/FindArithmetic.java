package com.onesoft.exp;

import java.io.File;
import java.io.FileReader;

public class FindArithmetic {

	public static void main(String[] args) {
		try {
			File f=new File("h");
			FileReader fr=new FileReader(f);
			int temp=0;
			if((temp=fr.read())!=-1){
			System.out.print((char)temp);	
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
