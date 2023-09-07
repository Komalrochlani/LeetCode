package com.code.interviewprepration;

public class LengthOfLastWorld {

	public static void main(String[] args) {

		String s = "  fly me   to   the moon       ";
		int result = lengthOfLastWord(s);
		System.out.println(result);
	}

	public static int lengthOfLastWord(String s) {
		String[] stringSplit = s.split(" ");
		int len = stringSplit.length;
		int count = 0;
		for (String str : stringSplit) {
			System.out.println(str);
		}

		return stringSplit[len - 1].length();
	}
}