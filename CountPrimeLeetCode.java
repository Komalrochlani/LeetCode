package com.code;

import java.util.Arrays;

public class CountPrimeLeetCode {

	public static void main(String[] args) {
		System.out.println(countPrimes(15));
	}

	public static int countPrimes(int n) {
        if(n<2)
        {
            return 0;
        }

        boolean isPrime[] = new boolean[n+1];
        isPrime[0] = true;
        isPrime[1] = true; 
        for(int i=2; i*i <= n;i++)
        {
            for(int j = 2*i; j <= n; j += i)
            {
                isPrime[j] = true;
            }
        }

        int count = 0;
        for(int i=0; i<n; i++)
        {
           
            if(isPrime[i] == false)
            {
                count++;
            }
        }
        return count;
	}
}
