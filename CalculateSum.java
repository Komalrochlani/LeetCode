package com.code.interviewprepration;

public class CalculateSum {
	static int total;
	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	
		int result = sum(a,b);
		System.out.println("result "+ result);
	}
	
	public  static int sum(int n1,int n2) {
		
		if(n1<=n2)
		{
			total = total + n1;
			sum(++n1,n2);
		}
		return total;
	}
	
}
