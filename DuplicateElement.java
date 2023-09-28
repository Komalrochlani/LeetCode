package com.code.interviewprepration;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int size = removeDuplicates(nums);
		System.out.println(size);
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> uniqueSet = new LinkedHashSet();
		for(int i=0;i<nums.length;i++)
		{
			uniqueSet.add(nums[i]);
		}
		int index=0;
		for(int i : uniqueSet)
        {
            nums[index]=i;
            index++;
        }
		
		return uniqueSet.size();
	}
}
