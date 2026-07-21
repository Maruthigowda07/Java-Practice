package com.Strings;

public class EncodeDecoe {

	public static void main(String[] args) {
    String s="Rfwzymn xsjmf";
      System.out.println(encode("Rfwzymn xsjmfRfwzymn xsjmf",5));
       System.out.println(decode(s,5));
	}
	public static String encode(String s,int n)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(ch[i]))
				ch[i]=(char) ((((((ch[i]+n)-'a')%26)+26)%26)+'a');
			else if(Character.isUpperCase(ch[i]))
				ch[i]=(char) ((((((ch[i]+n)-'A')%26)+26)%26)+'A');
		}
		return new String (ch);
	}
	public static String decode(String s,int n)
	{
		return encode(s,-n);
	}

}
