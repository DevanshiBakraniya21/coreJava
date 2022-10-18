package com.coreJava.array;

import java.util.Scanner;

/**
 * Input no. of matrix and show in table format
 * @author devanshi
 *
 */
public class Array_2D {

	@SuppressWarnings("resource")
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
		
		System.out.println("Output: ");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
