package com.code.interviewprepration;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}
	
	public  static List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
        List<Integer> innerList = new ArrayList<Integer>();
        List<List<Integer>> outerList = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
        	 if(i==len-2){
        		 System.out.println("in if");
                 break;
             }
            if( (nums[i]+nums[i+1]+nums[i+2]) == 0)
            {
                innerList.add(nums[i]);
                innerList.add(nums[i+1]); 
                innerList.add(nums[i+2]);
                System.out.println("inner list : " + innerList);
            }
        }
        outerList.add(innerList);
        System.out.println("outer list : " + outerList);
        return outerList;
    }
}
