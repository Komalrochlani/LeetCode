package com.code;

import java.util.Arrays;

public class PatternCharacter {

	public static void main(String[] args) {
		int n = 7;
		char[] ch = {'X','X','Y','Z','X','Z','Y'};
		
		Arrays.sort(ch);
		
		for(char sortedCh : ch) {
			System.out.print(sortedCh+" ");
		}
		
	}
}
