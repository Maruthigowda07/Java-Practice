package com.Strings;

public class Reverse {

	public static void main(String[] args) {
	  String s="java is very easy";
		System.out.println(rev(s));
	
	}
	public static String rev(String S)
	{
		
	int i=S.length()-1;
	int j=S.length()-1;
	String res="";
	while(i>=0)
	{
		while(i>=0&&S.charAt(i)!=' ') {
		 i--;
		}
		int k=i+1;
		while(k<=j) {
			res=res+S.charAt(k);
			k++;
		}
		 if(i>=0)
		 {
			 res=res+" ";
		 }
		 
		 i--;
		 j=i;
	}
	   return res;
}
}

			 
		
