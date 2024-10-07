package com.coreJava.array;

import java.util.Iterator;

class a{
	public void print() {
		System.out.println("A:");
	}
}

class b extends a{
public void print() {
	System.out.println("print B:");
	}
public void show() {
	System.out.println(" show B:");
}
}

public class test {
	public static int val=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj = new b();
		obj.print();
		obj.show();
		for(int i=0;i<7;i++) {
			val=i;
			name();
		}
		String a = "avc_sd_df_s.txt";
		System.out.println(a.split("_", 2)[1].split("\\.")[0]);
	}
	public static void name() {
		System.out.println(val);
	}
}
