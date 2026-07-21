package com.Strings;

public class notrepeating {

	public static void main(String[] args) {
          String s="ytkyt is is easy eha";
          String[] str=s.split(" ");
            
          for(int i=0;i<str.length;i++) {
        	  int count=0;
        	  for(int j=0;j<str.length;j++)
        	  {
        		  if(str[i].equals(str[j])) {
        			  count++;
        	  }
          }
      
          
	     if(count==1) {
		System.out.println(str[i]);
		
	}
          }
	}
}


