package com.code.interviewprepration;

public class Payramid123 {

	public static void main(String[] args) {
		int row=7;
		for(int i=1;i<=row;i++)
		{
			int k=1;
			for(int j=row;j>0;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}else if(k<=i)
				{
					System.out.print(k);
					k++;
				}
			}
			for(int t=i;t>=1;t--)
			{
				if(t>1)
				System.out.print(t-1);
			}
			System.out.println();
		}
	}
}
