package com.code.interviewprepration;

public class IndexFirstOccurance {

	public static void main(String[] args) {
		String s1 = "sadbutsad";
		String s2 = "sad";
		System.out.println(strStr(s1, s2));
		
	}
	
	
	 public static int strStr(String s1, String s2) {
	        
	        if(!s1.contains(s2))
	        {
	            return -1;
	        }
	        int j=0;
	        for(int i=0;i<s1.length();i++)
	        {
	        	if( j<s2.length() && s1.charAt(i) == s2.charAt(j))
	        	{
	        			j++;
	        	}else {
	        		j=0;
	        	}
	        }
	        s1.indexOf(s2);
	        return j;

	    }
}
