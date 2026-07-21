package com.Strings;

public class Occurance {

	public static void main(String[] args) {
		  String s1="aabbc";
		  char maxchar1=' ';
		  int maxcount1=0;
		  
		  char maxchar2=' ';
		  int maxcount2=0;
		  while(s1.length()> 0)
		  {
			 char ch=s1.charAt(0);
			 String s2=s1.replace(ch + "","");
			 int count=s1.length()-s2.length();
			 if(count>maxcount1)
			 {
				 maxcount2=maxcount1;
				 maxchar1=(char)count;
				 maxcount1=maxchar1;
				 maxchar1=ch;
				 
			 }else if(count>maxcount2&&count!=maxcount1)
				 maxcount2=count;
			 maxchar2=ch;
		  
		  s1=s2;
		  }
		  

	  System.out.println(maxchar1 + "=" + maxcount1);
	System.out.println(maxchar2 + "=" + maxcount2);
	}
}
