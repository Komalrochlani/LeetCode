package com.code.interviewprepration;

import java.util.Random;

public class MindGame {

	public static void main(String[] args) {
		System.out.println(mindGame(10));
	}
	
	 static int mindGame(int K) {
	        // code here
	        int n;
	        Random random = new Random();
	        int num = random.nextInt(10);
	        System.out.println(num);
	        n=num;
	        num = num*num;
	        System.out.println("after *" +num);
	        num +=K;
	        System.out.println("after +" +num);
	        num /=2;
	        System.out.println("after /" +num);
	        num = num - n;
	        System.out.println("after /" +num);
	        return num;
	    }
}
