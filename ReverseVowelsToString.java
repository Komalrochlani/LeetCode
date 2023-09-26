package com.code.string;

public class ReverseVowelsToString {

	public static void main(String[] args) {

		System.out.println(reverseVowels("leetcode"));
	}

	public static String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = s.length() - 1;
		boolean iTrue = false;
		boolean jTrue = false;
		while(i<j)
		{
			if (!(ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'I'
					|| ch[i] == 'E' || ch[i] == 'O' || ch[i] == 'U')) 
			{
				i++;
			}else {
				iTrue = true;
			}
			if (!(ch[j] == 'a' || ch[j] == 'i' || ch[j] == 'e' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A' || ch[j] == 'I'
					|| ch[j] == 'E' || ch[j] == 'O' || ch[j] == 'U')) 
			{
				j--;
			}else {
				jTrue = true;
			}
			
			if(iTrue && jTrue)
			{
				char swap = ch[i];
				ch[i] = ch[j];
				ch[j] = swap;
				iTrue = false;
				jTrue = false;
				i++;
				j--;
			}
		}
		

		return new String(ch);
	}
}
