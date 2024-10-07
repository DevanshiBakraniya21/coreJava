package com.coreJava.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Hr4 {

	public static void main(String[] args) {
		List<String> strings= new ArrayList<>();
		List<String> queries= new ArrayList<>();
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");
		
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ba");
		
		int l = strings.size();
		int l1 = queries.size();
		
		int[] i = new int[l1];
		
		for(int j=0;j<l1;j++) {
			int c = 0;
			for(int k=0;k<l;k++) {
				if(queries.get(j).equals(strings.get(k))) {
					c++;
				}
			}
			i[j] = c;
		}
		
		for(int lp =0;lp<l1;lp++) {
			System.out.println(i[lp]);
		}
	}

}
