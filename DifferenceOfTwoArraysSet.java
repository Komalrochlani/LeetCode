package com.code.interviewprepration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArraysSet {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,4,6};
		System.out.println(findDifference(arr1,arr2));
	}
	
    public static List<List<Integer>> findDifference(int[] num1, int[] num2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        for(int num:num1)
        {
            s1.add(num);
        }
        for(int num:num2)
        {
            s2.add(num);
        }
        for(int num:num2)
        {
            if(!s1.contains(num))
            {
                s3.add(num);
            }
        }

        s1.removeAll(s2);
        ans.add(new ArrayList(s1));
        ans.add(new ArrayList(s3));
        return ans;
    }
}
