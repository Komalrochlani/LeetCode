package com.code.interviewprepration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MajorityElement2 {
	
	public static void main(String[] args) {
		int[] arr = {3,2,3};
		System.out.println(majorityElement(arr));
	}
	
	public static List<Integer> majorityElement(int[] nums) {
		int count = nums.length / 3;
		System.out.println(count);
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i : nums)
		{
			map.put(i, map.getOrDefault(i, 0) +1);
		}
		for(int i : nums)
		{
			int n = map.get(i);
			if(n>count)
			{
				set.add(i);
			}
		}
		for(int t:set)
		{
			list.add(t);
		}
		return list;
	}
}


//for (int i = 0; i < nums.length; i++) {
//	if (map.containsKey(nums[i])) {
//		int n = map.get(nums[i]);
//		map.put(nums[i], ++n);
//	} else {
//		map.put(nums[i], 1);
//	}
//}
//System.out.println(map);
//for (int i = 0; i < nums.length; i++) {
//	int c = map.get(nums[i]);
//	if (c > count) {
//		if(!list.contains(nums[i]))
//			list.add(nums[i]);
//		System.out.println(nums[i]);
//	}
//}
