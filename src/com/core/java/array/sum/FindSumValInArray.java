package com.core.java.array.sum;

public class FindSumValInArray {
	public static void main(String[] args) {
		int[] nums = {2,5,5,11};
		int target = 10;

		int[] i = getNumsLenght(nums, target);
		if (i.length > 0) {
			System.out.println(i[0] + "-" + i[1]);
		} else {
			System.out.println("fail");
		}
	}

	public static int[] getNumsLenght(int[] nums, int target) {
		int[] result = new int[2];
		int numsLength = nums.length;
		System.out.println(numsLength);
		if (numsLength >= 2) {
			if (numsLength == 2) {
				if ((nums[numsLength - 2] + nums[numsLength - 1]) == target) {
					result[0] = 0;
					result[1] = 1;
				}
			} else {
				int m = numsLength / 2;
				System.out.println(m);
				for (int j = 0; j < numsLength; j++) {
					for (int k = 1; k < numsLength; k++) {
						System.out.println(nums[j]+"--"+nums[k]);
						if(j != k) {
							if ((nums[j] + nums[k]) == target) {
								result[0] = j;
								result[1] = k;
								j=numsLength;
								break;
							}
						}
					}
				}
			}

		}

		return result;

	}
}
