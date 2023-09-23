package com.code;

public class StringToInteger {

	public static void main(String[] args) {
		int result = myAtoi("   -42");
		System.out.println(result);
	}

	public static int myAtoi(String s) {
		 
		int len = s.length();
        long ans=0;
        boolean isPos = true;
        int i =0;
        while(i<len && s.charAt(i) == ' ')
            i++;
        if(i == len)
            return 0;

        if(s.charAt(i) == '-')
        {
            isPos = false;
            i++;
        }else if(s.charAt(i) == '+')
        {
            i++;
        }

        for(;i<len;i++)
        {
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                break;
            
            ans = ans*10 + s.charAt(i) - '0';

            if(isPos && ans > (Math.pow(2,31)-1))
            {
                ans = (long)(Math.pow(2,31)-1);
                break;
            }else if(!isPos && ans > Math.pow(2,31))
            {
                ans = (long)(Math.pow(2,31));
                break;
            }
                
        }

        if(!isPos)
            return (int)(-1*ans);

        return (int)ans;
	}
}
