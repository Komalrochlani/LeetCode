package com.code.interviewprepration;

public class StringPalindrome {

	public static void main(String[] args) {
		String s ="0P0";
		String sLowerCase = s.toLowerCase();
		System.out.println("lower"+sLowerCase);
		String rev = "",orignal="";
		for(int i=sLowerCase.length()-1;i>=0;i--)
		{
			if(Character.isLetterOrDigit(sLowerCase.charAt(i))) {
				rev = rev + sLowerCase.charAt(i);
			}
			
		}
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isLetterOrDigit(s.charAt(i))) {
				orignal = orignal + s.charAt(i);
			}
			
		}
		System.out.println(orignal);
		System.out.println(rev);
		  if(orignal.equalsIgnoreCase(rev))
	        {
	            System.out.println(true);
	        }else{
	            System.out.println(false);
	        }
	}
}
