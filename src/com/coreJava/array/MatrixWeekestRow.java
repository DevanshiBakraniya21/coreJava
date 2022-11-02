package com.coreJava.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Get Weekest Row no 
 * Desc: You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
	A row i is weaker than a row j if one of the following is true:
	The number of soldiers in row i is less than the number of soldiers in row j.
	Both rows have the same number of soldiers and i < j.
 * @author devanshi
 *
 */
public class MatrixWeekestRow {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter matrix ");
		System.out.println("Row Size: ");
		int row = s1.nextInt();
		System.out.println("Column Size: ");
		int column = s1.nextInt();
		int[][] a1 = new int[row][column];
		
		for(int i=0; i < row; i++) {
			for(int j=0; j<column; j++) {
				System.out.println("Enter a["+i+"]["+j+"] :");
				a1[i][j] = s1.nextInt();
			}
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < a1.length; i++) {
			int i1 = 0;
			for(int j=0; j < a1[i].length; j++) {
				if(a1[i][j] == 1) {
					i1++;
				}
			}
			map.put(i, i1);
		}
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return (i1).compareTo(i2);
            }
        });
        for (Integer ij : list) {
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(ij)) {
                    sortedMap.put(entry.getKey(), ij);
                }
            }
        }
        System.out.println(sortedMap);
        int k = 3;// up to which index you want data
        int[] l1 = new int[k] ;
        int l =1;
		for( Integer entry : sortedMap.keySet()) {
			if(k >= l) {
				l1[l-1] = entry;
				l++;
			}
		}
		System.out.println("Sorting Index: ");
		for (int i=0; i < l1.length; i++) {
            System.out.print(l1[i]+" ");
        }	
		
	}

}
