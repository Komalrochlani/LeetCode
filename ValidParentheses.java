package com.code.interviewprepration;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(isValid("]"));
	}

	public static boolean isValid(String s) {

		if(s.length() <= 1){
            return false;
        }
        char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
			{
				stack.push(ch[i]);
			}
            else if(!stack.isEmpty() &&  ((ch[i] == ')' && stack.peek() == '(') 
					|| (ch[i] == '}' && stack.peek() == '{')
					|| (ch[i] == ']' && stack.peek() == '[')))
			{
				stack.pop();
			}
            else{
                return false;
            }	
		}
		
		return stack.isEmpty();
	}
}
