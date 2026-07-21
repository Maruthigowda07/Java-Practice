package com.Arrays;

public class EvenandOdd {

	public static void main(String[] args) {
		int[] a= {11,33,55,65,75,86,97};
		int evenSum=0,oddSum=0;
		   for ( int n:a)
		   {
			   if(n % 2==0)
				   evenSum+=n;
			   else
				   oddSum+=n;
			   
		   }
		   System.out.println("Even Sum=" +evenSum);
		   System.out.println("Odd Sum=+" +oddSum);
	
		   }
}


