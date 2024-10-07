package com.coreJava.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Hr2 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		long min =0L;
		long max=0L;
		
		for(int i=0;i<l1.size();i++) {
			long sum =0L;
			for(int j=0;j<l1.size();j++) {
				if(i!=j) {
					sum+=l1.get(j);
				}
			}
			System.out.println(i+"-"+sum);
			if(min==0 && max==0) {
				min = sum;
				max = sum;
			}else if(min > sum ) {
				min = sum;
			}else if(max < sum) {
				max = sum;
			}
		}
		
		System.out.println(min +" "+max);
	}

}
