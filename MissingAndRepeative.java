package com.code.interviewprepration;

import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeative {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 1, 5 };
		int n = 10;
		// System.out.println(missingRepetative(arr, n));
		missingRepetative(arr, n);
	}

	public static int[] missingRepetative(int[] arr, int n) {
		int[] sample = new int[2];
		// Create a HashMap to store the frequency of each number
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		int repeating = 0;
		int[] missing = new int[5];
		int value =0 ;
		for (int num : arr) {
			// Update the frequency of each number in the HashMap
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		System.out.println(frequencyMap);
		for (int i = 1; i <= n; i++) {
			if (frequencyMap.containsKey(i)) {
				// If the number is in the HashMap, check its frequency
				if (frequencyMap.get(i) == 2) {
					repeating = i;
				}
			} else {
				// If the number is not in the HashMap, it is missing
				missing[value++] = i;
			}
		}
		System.out.println("Repeating Number: " + repeating);
		for(int i=0;i<value;i++)
		{
			System.out.println("Missing Number: " + missing[i]);
		}
		
		return sample;
	}
}
