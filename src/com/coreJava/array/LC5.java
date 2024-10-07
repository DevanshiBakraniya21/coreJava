package com.coreJava.array;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LC5 {
	public static void main(String[] args) {
		int[] nums = {1,2};
		int k = 2;
		
			int[] temp = new int[nums.length];
	        for(int j=0,i =nums.length-1 ;j<nums.length;j++,i--) {
				temp[j] = nums[i];
			}
	        if(nums.length > k) {
				LinkedList<Integer> queue = new LinkedList<>();
				for(int j=k-1;j>=0 ;j--) {
					System.out.println("tesm: "+temp[j]);
					queue.add(temp[j]);
				}
				for(int j=0;j<nums.length-k;j++) {
					System.out.println(nums[j]);
					queue.add(nums[j]);
				}
				int i=0;
				for(Integer val : queue) {
					nums[i] = val;
					i++;
				}
				System.out.println(queue);
	        }else {
	        	nums = temp;
	        	System.out.println(nums[0]);
	        }
	}
}
