package com.code.interviewprepration;

public class IsHappyNumber {


	public static void main(String[] args) {
	
		
		System.out.println(isHappy(19));
	}
	
	
	public static boolean isHappy(int n) {

		while (n>0) {
			int num = 0;
			for (int i = n; i > 0; i /= 10) {
				int r = i % 10;
				num += Math.pow(r, 2);
				
			}
			
			System.out.println(num);
			n = num;
			if(n==1)
				break;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}

	}
}
