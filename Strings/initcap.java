 package com.Strings;

public class initcap {
	public static void main(String[] args) {
	
      String s="java is easy";
      char[] ch=s.toCharArray();
      for(int i=0;i<s.length();i++)
      {
    	  if(i==0||ch[i]==' ')
    	  if(ch[i]>='a'&&ch[i]<='s')
    		  ch[i]-= 32;	  
      }
      System.out.println(ch);
      
      
}
}
