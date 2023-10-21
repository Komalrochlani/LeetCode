package com.code.interviewprepration;

import java.util.Arrays;

public class MajorityElement {


	public static void main(String[] args) {
	
		int[] arr  = {2,2,1,1,1,2,2};
		int result = majorityElement(arr); 
		System.out.println("Result : " + result);
	}
	 public static int majorityElement(int[] nums) {
		 int n = nums.length; 
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length;i++)
	        {
	        	System.out.println(nums[i] );
	        
	        	
	        }
	        System.out.println("nums "+nums[n/2]);
	        return nums[n/2];
		 
		 
		 //	        Map<Integer,Integer> map = new HashMap<>();
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            if(map.containsKey(nums[i]))
//	            {
//	                int n = map.get(nums[i]);
//	                map.put(nums[i],++n);
//	            }else{
//	                map.put(nums[i],1);
//	            }
//	        }
//	        System.out.println(map);
//	        int max=0,index=0;
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            int n = map.get(nums[i]);
//	         //   System.out.println("n "+n);
//	            if(n>max)
//	            {
//	                index=i;
//	            	max = n;
//	     //           System.out.println("max "+max);
//	            }
//	        }
//	        return nums[index];
	    }
}
