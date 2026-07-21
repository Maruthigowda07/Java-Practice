package com.Strings;

public class mincount {

	public static void main(String[] args) {
		  String s1="aabbc";
		  char minchar1=' ';
		  int mincount1=0;
		  
		  char minchar2=' ';
		  int mincount2=0;
		  while(s1.length()> 0)
		  {
			 char ch=s1.charAt(0);
			 String s2=s1.replace(ch + "","");
			 int count=s1.length()-s2.length();
			 if(count<mincount1)
			 {
				 mincount2=mincount1;
				 mincount1=(char)count;
				 mincount1=minchar1;
				 minchar1=ch;
				 
			 }else if(count<mincount2&&count!=mincount1)
				 mincount2=count;
			 minchar2=ch;
		  
		  s1=s2;
		  }
		  

	  System.out.println(minchar1 + "=" + mincount1);
	System.out.println(minchar2 + "=" + mincount2);
	}


	}


