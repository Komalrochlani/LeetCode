package com.code.interviewprepration;

public class MergeStringAlternatively {

	public static void main(String[] args) {
		System.out.println(mergeAlternately("abcd", "pq"));
	}

	public static String mergeAlternately(String word1, String word2) {
	        StringBuffer sb = new StringBuffer();
	        int len1 = word1.length();
	        int len2 = word2.length();
	       
	        

	            if(len1>len2){
	                for(int i=0;i<len1;i++)
	                {
	                    sb.append(word1.charAt(i));
	                    if(i<len2)
	                    {
	                        sb.append(word2.charAt(i));
	                    }
	                }
	            }else{
	                for(int i=0;i<len2;i++)
	                {
	                    if(i<len1)
	                    {
	                        sb.append(word1.charAt(i));
	                    }
	                    sb.append(word2.charAt(i));
	                }
	            }
	            return sb.toString();
	        
	        //Method 1
// 			int i=0,j=0;
//	        if(len1<len2)
//	        {
//	            while(i<len1 || j<len2)
//	            {
//	                if(i<len1)
//	                {
//	                    sb.append(word1.charAt(i));
//	                    i++;
//	                }
//	                if(j<len2){
//	                    sb.append(word2.charAt(j));
//	                    j++;
//	                }
//	            }
//	        }else if(len1 == len2)
//	        {
//	            while(i<len1 || j<len2)
//	            {
//	                sb.append(word1.charAt(i));
//	                i++;
//	                sb.append(word2.charAt(j));
//	                j++;                
//	            }
//	        }
//	        else if(len1>len2){
//	            while(i<len1 || j<len2)
//	            {
//	                if(i<len1)
//	                    {
//	                        sb.append(word1.charAt(i));
//	                        i++;
//	                    }
//	                    if(j<len2){
//	                        sb.append(word2.charAt(j));
//	                        j++;
//	                    }
//	            }
//	        }
//	        return String.valueOf(sb);
//	    }


}}
