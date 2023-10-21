package com.code.interviewprepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RotateArrayLeetCode {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7};
		int k =3;
		rotate(arr, k);
		
//			rotate 1 steps to the right: [7,1,2,3,4,5,6]
//			rotate 2 steps to the right: [6,7,1,2,3,4,5]
//			rotate 3 steps to the right: [5,6,7,1,2,3,4]
	}

	public static void rotate(int[] nums, int k) {
		for(int i=0;i<k;i++)
		{
			int temp = nums[nums.length-1];
			for(int j = nums.length-1;j>0;j--) {
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
			for(int t : nums)
			{
				System.out.print(t);
			}
			System.out.println();
		}
		
		
	}
}
