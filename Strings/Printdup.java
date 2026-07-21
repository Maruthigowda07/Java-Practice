package com.Strings;

public class Printdup {

	public static void main(String[] args) {

		        String s = "javadev";
		        String res = "";

		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);   
		            for (int j = i + 1; j < s.length(); j++) {

		                if (ch == s.charAt(j) && !res.contains(ch + "")) {
		                    res += ch;
		                }

		            }
		        }

		        System.out.println(res);
		    }
		}