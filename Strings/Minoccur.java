package com.Strings;

public class Minoccur {

	public static void main(String[] args) {
		String s = "abbbcc";

		char minChar = s.charAt(1);
		int minCount = 1;

		for (int i = 0; i < s.length(); i++) {
		    int count = 0;

		    for (int j = 0; j < s.length(); j++) {
		        if (s.charAt(i) == s.charAt(j)) {
		            count++;
		        }
		    }

		    if (count < minCount) {
		        minCount = count;
		        minChar = s.charAt(i);
		    }
		}

		
		System.out.println("a= " + minCount);
	}

}
