package com.coreJava.array;

public class LC2 {
	public static void main(String[] arg) {
		String haystack = "leetcode";
		String needle = "ee";
		int c=0;
		char[] q1 = haystack.toCharArray();
		char[] q2 = needle.toCharArray();
		System.out.println(haystack.contains(needle)+"-"+haystack.indexOf(needle));
		int k=0;
		for(int j=1; j<haystack.length();j++){
           for(int i=1; i<needle.length() && k != needle.length();i++) {
        	   if(k>=1 &&haystack.charAt(j-1) == needle.charAt(i-1) && haystack.charAt(j) == needle.charAt(i)) {
        		   System.out.println("in");
        		   k++;
        	   }else if(haystack.charAt(j) == needle.charAt(i)) {
        		   System.out.println("in1");
        		   k++;
        	   }
           }
        }
		
		System.out.println("success"+k);
	}
}
