package com.coreJava.array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LC3 {

	public static void main(String[] args) {
		String ransomNote = "chejaccdae";
		String magazine = "geceeibccchjejhdd";
		char[] q1 = magazine.toCharArray();
		char[] q2 = ransomNote.toCharArray();
		Arrays.sort(q1);
		Arrays.sort(q2);
		int r=0;
		for(int j=0; j< ransomNote.length();j++){
        	   if(q1[j] == q2[r]) {
        		   System.out.println("in");
            	   r++;
               }
        	   if(r == q2.length)
        		   System.out.println("success1");
           }
		System.out.println(r==ransomNote.length());
		System.out.println("success");
		int n=0;
		for(int m=1;m<ransomNote.length();m++)
		{
			if(q2[m-1] != q2[m]) {
				System.out.println(q2[m]);
			}
		}
	}

}
