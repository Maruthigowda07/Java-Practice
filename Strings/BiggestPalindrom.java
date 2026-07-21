package com.Strings;


 class BiggestPalindrom {

	public static void main(String[] args) {
		String s="malayalam";
		String bigPalindrom="";
		for(int i=0;i<s.length();i++)
		{
		 for(int j=i+3;j<s.length();j++)
		 {
			 String s1=s.substring(i,j);
		    if(isPalindrom(s1))
		    {
		    	if(s1.length()>bigPalindrom.length()) bigPalindrom=s1;
		    	
		    	
		    }
		 }
		 
		 
		}

		    System.out.println(bigPalindrom);
	}

	public static boolean isPalindrom(String s) {
		int i=0;
		int j=s.length()-1;
		return false;
	}

}

