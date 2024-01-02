package com.code;

import java.math.BigInteger;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {123};
		int[] result = plusOne(arr);
		for(int index : result)
        {
			System.out.print(index);
        }
		
	}
	
	public  static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--)
	       {
	           if(digits[i]<9)
	           {
	               digits[i]++;
	               return digits;
	           }
	           digits[i]=0;
	       }
	        digits = new int[digits.length + 1];
	        digits[0] = 1;
	        return digits;
    }
}
