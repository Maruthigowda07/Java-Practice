package com.Strings;

public class Maxoccur {

	public static void main(String[] args) {
		String s = "abbbcc";

		char maxChar = s.charAt(0);
		int maxCount = 0;

		for (int i = 0; i < s.length(); i++) {
		    int count = 0;

		    for (int j = 0; j < s.length(); j++) {
		        if (s.charAt(i) == s.charAt(j)) {
		            count++;
		        }
		    }

		    if (count > maxCount) {
		        maxCount = count;
		        maxChar = s.charAt(i);
		    }
		}

		System.out.println("Maximum occurred character = " + maxChar);
		System.out.println("Count = " + maxCount);
	}

}
