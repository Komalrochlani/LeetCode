package com.code;

public class StringTrimAndStrip {

	public static void main(String[] args) {
		String str = " \0\n   a     good example   \n ";
		System.out.println(str.trim());
		System.out.println(str.strip());
		System.out.println("helloo");
	}
}
