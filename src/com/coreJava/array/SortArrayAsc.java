package com.coreJava.array;

import java.util.ArrayList;

/**
 * Sort array's of element 
 * a[1,3,5,6,8,9]
 * b[2,5,7,10,11]
 * need result like [1,2,3,5,5,6,7,8,8,9,10,11]
 * @author devanshi
 *
 */
public class SortArrayAsc {

	public static void main(String[] args) {
		int[] a = {1,3,5,6,8,9};
		int[] b = {2,5,7,8,10,11};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0,j = 0;
		
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				list.add(a[i]);
				i++;
			}else if(b[j] < a[i]) {
				list.add(b[j]);
				j++;
			}
		}
		
		while(i < a.length) {
			list.add(a[i]);
			i++;
		}
		
		while(j < b.length) {
			list.add(b[j]);
			j++;
		}
		
		System.out.println(list);
	}

}
