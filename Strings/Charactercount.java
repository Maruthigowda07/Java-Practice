package com.Strings;

public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="raju danger smiley";
           int count=0;
         for(int i=0;i<s.length();i++)
         {
        	 char ch=s.charAt(i);
        	 if(ch=='a'||ch=='e'||ch=='i')
        	 {
        		 count ++;
        	 }
         }
          System.out.println("Vowel count =" +count);
	}
}
        
        	 