package com.code;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int sum = 0;
		int num = sc.nextInt();
		int n = num;
		for (int i = num; n < 0; n/=10) {
			sum = (sum * 10) + n % 10;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
