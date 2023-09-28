package com.code.interviewprepration;

public class WaveArray {

	public static void main(String[] args) {
		int[] arr = {1,4,6,7,45,66,75,75,86,87};
		//int[] arr = {3};
		convertToWave(arr.length, arr);
	}
	
	public static void convertToWave(int n, int[] a) {
        // code here
        if(n==1)
        	return;
        
        for(int i=0;i<n-1;i+=2)
        {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i] + " ");
        }
        
	}
}
