package com.code.interviewprepration;

public class RotationalString {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dabc";
		System.out.println(rotationString(s1, s2));
		
	}
	
	public static boolean rotationString(String a,String b)
	{
		
		if(a.length() != b.length())
			return false;
		String s1s1 = a + a;
		
		return s1s1.contains(b);
		
		
//		char[] ch = a.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			char temp = ch[0];
//			for(int j=1;j<ch.length;j++)
//			{
//				ch[j-1] = ch[j];
//			}
//			ch[ch.length-1]=temp;
//			System.out.println(ch);
//			if(b.equals(String.valueOf(ch)))
//			{
//				return true;
//			}
//		}
//		return false;
	}
}
