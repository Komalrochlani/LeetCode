package com.code;

import java.util.Arrays;

public class ArrayArugment {

	public static void main(String[] args) {
		int[] arr = {0,1,2,0,0,3,4,0,0};
		int left = 0;
		int right = arr.length -1 ;
		
//		while(left<right)
//		{
//			while(arr[right] == 0 && right > left)
//			{
//				right--;
//			}
//			while(arr[left] != 0 && left < right)
//			{
//				left++;
//			}
//			
//			if(left < right)
//			{
//				int temp = arr[left];
//				arr[left] = arr[right];
//				arr[right] = temp;
//			}
//		}
		 int i = 0 ;
	     for(int num : arr)
	     {
	          if(num != 0)
	          {
	              arr[i] = num;
	             
	              i++;
	              
	          }
	     }
	
	    while(i<arr.length)
	    {
	    	
	    	arr[i]=0;
	    	
	    	i++;
	    	
	    }
		for(int j=0;j<arr.length;j++)
		{
			
			System.out.println(arr[j]);
		}
	}
}
