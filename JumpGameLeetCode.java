package com.code.interviewprepration;

public class JumpGameLeetCode {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4 };
		//int[] arr = { 3,2,1,0,4 };
		boolean result = canJump(arr);
		System.out.println(result);
	}

	public static boolean canJump(int[] nums) {
        int len=nums.length;
        int i=0;
        for(int reach=0;i<len && i<=reach;++i){
            reach=Math.max(i+nums[i],reach);
            System.out.println(i + " " + (i+nums[i]) + " " + reach);
        }
        return i==len;
    }

	
}
