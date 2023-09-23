package com.code;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 5, 7 };//
		List<String> result = summaryRanges(arr);
		System.out.println(result);
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> listTest = new ArrayList<>();
		int start = 0;
		for (int i = 0; i < nums.length; i++) {
			start = nums[i];
			while (i+1 < nums.length && nums[i] + 1 == nums[i + 1]) {
				i++;
			}
			if (start == nums[i]) {
				listTest.add(start + " ");
				System.out.println(start + " ");
			} else {
				listTest.add(start + " " + nums[i]);
				System.out.println(start + " " + nums[i]);
			}
		}
		return listTest;
	}
}
