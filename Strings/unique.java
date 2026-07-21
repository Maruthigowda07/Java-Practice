package com.Strings;

public class unique {

	public static void main(String[] args) {
		String s="java";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='\u0000') continue;
			int count=1;
			for(int j=1;j<s.length();j++)
			{
				if(ch[i]==ch[j]) {
				  count++;
				  
				ch[j]='\u0000';
			}
			if(count>=1) {
	
    	System.out.println(ch[i]);
}
			}
		}}}



