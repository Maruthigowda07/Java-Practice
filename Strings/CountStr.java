package com.Strings;

public class CountStr {

	public static void main(String[] args) {
		   String s="java is veryeasy   maruthi  ";
		   int count=1;
		   for(int i=0;i<s.length();i++)
		   {
			   char ch=s.charAt(i);
				  
			   if(ch==' ') {
				   count++;
				   
			   }
		   }
			   System.out.println(count);
			   
		   }
	}


