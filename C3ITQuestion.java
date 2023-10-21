package com.code.interviewprepration;

public class C3ITQuestion {

	public static void main(String[] args) {
		
		int row = 9;
		int col = 9;
		for(int i=0;i<=row/2;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==(row/2)){
					System.out.print("*");
				}else if(j==(row/2 - i)|| j==(row/2 + i) )
				{ 
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int k = (row/2) - 1;
		for(int i=row/2+1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==i-row/2 || j==(row/2) + k)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			k--;
		}
		
	}
}
