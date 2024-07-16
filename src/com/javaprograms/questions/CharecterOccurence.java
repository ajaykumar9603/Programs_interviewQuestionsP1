package com.javaprograms.questions;

import java.util.HashMap;

public class CharecterOccurence {

	public static void main(String[] args) {
		
		String str = "Ajaykumar";
        HashMap<Character,Integer>  charCount = new HashMap<>();


       for (int i=0; i<str.length();i++) {

       	if (charCount.containsKey(str.charAt(i))) {

       		int count = charCount.get(str.charAt(i));
       		System.out.println();


       		charCount.put(str.charAt(i), ++count);

       	}

       	else {
       		charCount.put(str.charAt(i), 1);

       	}
       	}

       System.out.println(charCount);
       }

	}


