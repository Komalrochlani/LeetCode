package com.code.interviewprepration;

import java.util.ArrayList;

public class LeadersInArrayGeeksForGeeks {

	public static void main(String[] args) {
		int[] arr = {16,17,4,3,5,2};
		System.out.println(leaders(arr, arr.length));
	}
	
	public static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i=0;i<n;i++)
	        {
	            int count=0;
	            for(int j = i+1;j<n;j++)
	            {
	                if(arr[i] >= arr[j])
	                {
	                    count=0;
	                }else{
	                    count=1;
	                    break;
	                }
	            }
	            if(count==0)
	            {
	                list.add(arr[i]);
	            }
	        }
	        return list;
	    }
}
