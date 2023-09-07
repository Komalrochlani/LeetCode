package com.code.interviewprepration;

public class ReverseTheWord {
	
	public static void main(String[] args) {
		String result = reverseWords("a  good     example");
		//System.out.println(result);
	}
	public static String reverseWords(String s) {
        String[] str = s.strip().split(" ");
		/*
		 * for(String s1 : str) { System.out.println(s1); }
		 */
        StringBuilder strAppend = new StringBuilder();
        int len = str.length;
        //System.out.println(len);
        for(int i=len-1;i>=0;i--)
        {
            if(!str[i].isBlank()){
                strAppend=strAppend.append(str[i]);
                if(i!=0){
                    strAppend=strAppend.append(" ");
                }
            }
            
            System.out.println("string append:" + strAppend);
        }
        
        return strAppend.toString();
 
}
}



