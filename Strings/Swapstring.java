package com.Strings;

public class Swapstring {

	public static void main(String[] args) {
       String s1="rama";
       String s2="sitamma";
       System.out.println("Before Swaping");
       System.out.println("s1=" + s1);
       System.out.println("s2=" + s2);
       System.out.println("-------");
       s1=s1+s2;
       s2=s1.substring(s2.length()-s2.length());
       System.out.println("After Swaping");
       System.out.println("s1=" + s1);
       System.out.println("s2=" + s2);
	}

}
