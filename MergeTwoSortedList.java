package com.code.interviewprepration;

import java.util.Arrays;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,4};
		int[] arr2 = {1,3,4};
		int[] merge = new int[arr1.length + arr2.length];
		int i=0,j=0,n=0;
		while(i<arr1.length || j<arr2.length)
		{
			if(i<arr1.length)
			{
				merge[n++] = arr1[i];
				i++;
			}else
				
			{
				merge[n++] = arr2[j];
				j++;
			}
		}
		
		Arrays.sort(merge);
		for(int r=0;r<merge.length;r++)
		{
			System.out.println(merge[r]);
		}
		
		
	}
	
	
}
