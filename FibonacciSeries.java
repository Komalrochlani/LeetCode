package com.code;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		num1 = 0;
		num2 = 1;
		System.out.print(num1 + " " + num2);
		for (int i = 0; i < 30; i++) {
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}
	}
}
