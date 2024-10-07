package com.coreJava.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hr1 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(-2);
		l1.add(3);
		l1.add(-21);
		l1.add(0);
		l1.add(4);
		l1.add(1);
		System.out.println(Boolean.parseBoolean("false"));
		int l= l1.size();
		BigDecimal lb = new BigDecimal(l);
		int p=0;
		int n=0;
		int z=0;
		
		
		for(Integer i:l1) {
			if(i==0) {
				z++;
			}else if(i<0) {
				n++;
			}else if(i>0) {
				p++;
			}
		}
		System.out.println("-N-"+n+"-P-"+p+"-z-"+z);
		BigDecimal a1 = new BigDecimal(p).divide(lb,6,RoundingMode.UP);
		System.out.println(a1);
		BigDecimal b1 = new BigDecimal(n).divide(lb,6,RoundingMode.UP);
		System.out.println(b1);
		BigDecimal c1 = new BigDecimal(z).divide(lb,6,RoundingMode.UP);
		System.out.println(c1);
	}

}
