package com.code.interviewprepration;

public class TwoSumLeetCode {

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[] ans =twoSum(arr, 9);
		System.out.println("["+ans[0]+","+ans[1]+"]");
	}
	// Input:

	public static int[] twoSum(int[] numbers, int target) {
		int[] a = new int[2];
		int i = 0;
		int j = numbers.length - 1;

		while (i != j) {
			if (numbers[i] + numbers[j] == target) {
				a[0] = i + 1;
				a[1] = j + 1;
				break;
			} else if (numbers[i] + numbers[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return a;
	}

}