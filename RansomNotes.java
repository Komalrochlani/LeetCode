package com.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNotes {

	public static void main(String[] args) {
		boolean result = canConstruct("zg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
		System.out.println(result);
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		 if (ransomNote.length() > magazine.length()) return false;
	        int[] alphabets_counter = new int[26];
	        
	        for (char c : magazine.toCharArray())
	            alphabets_counter[c-'a']++;
	        
			/*
			 * for(int i=0;i<alphabets_counter.length;i++) { System.out.print(i + "->" +
			 * alphabets_counter[i] + ","); }
			 */
	        for (char c : ransomNote.toCharArray()){
	            if (alphabets_counter[c-'a'] == 0) return false;
	            alphabets_counter[c-'a']--;
	        }
	        return true;
	}
}

//
//boolean flag=false;
//for(int i=0;i<ransomChar.length;i++)
//{
//  if(ransomChar[i]==magazineChar[i])
//  {
//      flag = true;
//  }else{
//      flag=false;
//      break;
//  }
//}
//if(flag)
//{
//  return true;
//}
//else{
//  return false;
//}
