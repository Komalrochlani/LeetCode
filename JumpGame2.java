package com.code.interviewprepration;

public class JumpGame2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4 };
		int result = jump(arr);
		System.out.println(result);
	}
	
	 public static int jump(int[] nums) {
	        int len = nums.length;
	        int i=0;
	        int jump = 0,current=0;
	        for(int reach=0;i<len-1;++i)
	        {
	           reach = Math.max(i+nums[i],reach);
	           if(i==current)
	           {
	               current = reach;
	               jump++;
	           }
	        }
	        return jump;
	    }
}
