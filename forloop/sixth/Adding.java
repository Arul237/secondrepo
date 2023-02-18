package com.onesoft.forloop.sixth;

public class Adding {

	public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        int sum = 0;
        int total=0;
        int count=0;
        
        for(int i = 1; i <= input; i++)                // 1+6 2+6 3+6
        {
            sum = sum+i; 
            total +=count+sum;
           
        }
        
        
        System.out.println("Output is "+total); // LINE B
    
    }


	}


