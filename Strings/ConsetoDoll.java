package com.Strings;

public class ConsetoDoll {
	public static void main(String[] args) {
		String s="BOSS";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			
			if(ch[i]==ch[i+1]) {
			ch[i+1]='$';
				
			}
		System.out.println(ch);
		
		}
	}
}


