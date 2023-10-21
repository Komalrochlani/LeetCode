package com.code.interviewprepration;

public class SandGlassStarPattern {

	public static void main(String[] args) {
		int row=20;
		for(int i=0;i<row/2;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=i;k<row/2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<row/2;i++)
		{
			for(int j=row/2-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
