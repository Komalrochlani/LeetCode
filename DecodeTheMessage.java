package com.code.interviewprepration;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog";
		String msg = "vkbs bs t suepuv";
		System.out.println(decodeMessage(key, msg));
		
	}
	
	public static String decodeMessage(String key, String message) {
		Map<Character,Character> map = new HashMap<>();
        char value = 'a';
       
        
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<key.length();i++)
        {

        	if(!map.containsKey(key.charAt(i)))
        	{
        		if(key.charAt(i) == ' ') {
        			continue;
        		}
        			map.put((key.charAt(i)), value++);
        		
        		
        	}
        }
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i) == ' ')
            {
                sb.append(' ');
               // continue;
            }
        	if(map.containsKey(message.charAt(i)))
        	{
        		sb.append(map.get(message.charAt(i)));
        	}
        }
        return sb.toString();
    }
}
