package com.code;

import java.util.Scanner;

public class ArrayDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter a list of 3 digit numbers");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a Number whose sum you want");
		int num = sc.nextInt();// 15
		int sum = 0;
		for (int i = 0; i < size; i++) 
		{
			sum = 0;
			int n = arr[i];
			for (int j = 0; j < n; j++) 
			{
				sum += n % 10;
				n = n / 10;
			}
			if(sum ==  num) {
				System.out.println(arr[i]);
			}
		}

	}

}
