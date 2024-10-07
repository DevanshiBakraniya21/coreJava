package com.coreJava.interviewqa;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String str1,String str2) {
		int sl1 = str1.length();
		int sl2 = str2.length();
		if(sl1 == sl2) {
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			for(int i=0; i < sl1; i++) {
				if(s1[i]!=s2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "abnc";
		String str2 = "bnca1";
		System.out.println("Is Anagram: "+isAnagram(str1,str2));
	}

}
