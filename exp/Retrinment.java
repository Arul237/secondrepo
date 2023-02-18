package com.onesoft.exp;

import java.io.IOException;

public class Retrinment {

	
		public static void main(String[] args) throws IOException,Exception,Exception {
			int age=58;
			try {
				if(age<59) {
					throw new Exception("retrinment");
				}
				else {
					System.out.println("eligible");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
