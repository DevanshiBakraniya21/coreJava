package com.coreJava.array;

import java.util.Scanner;

/**
 * Find List of Even Number
 * @author devanshi
 *
 */
public class Array_1D {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int size = s.nextInt();
		int[] a1 = new int[size];
		
		for(int j = 0; j < size; j++) {
			System.out.println("Enter Array Value of "+j+":");
			a1[j] = s.nextInt();
		}
		
		System.out.println("Even number:");
		for(int j = 0; j < size; j++) {
			if(a1[j]%2 == 0) {
				System.out.println("a1["+j+"] = "+ a1[j]+"\n");
			}
		}
	}

}
