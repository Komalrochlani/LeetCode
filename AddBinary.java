package com.code;

public class AddBinary {

	public static void main(String[] args) {

		System.out.println(addBinary("1111", "1111"));
	}	
	
	public static String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        StringBuffer res = new StringBuffer();
        int carry =0;
        while(len1 >=0 || len2 >=0 )
        {
            int sum = carry;
            if(len1 >= 0)
            {
                if(a.charAt(len1) == '1')
                    sum++;
                len1--;
            }
            
            if(len2 >= 0)
            {
                if(b.charAt(len2) == '1')
                    sum++;
                len2--;
            }
            
        
            if(sum == 3)
            {
                res.append("1");
                carry = 1;
            }else if(sum == 2)
            {
                res.append("0");
                carry = 1;
            }else if(sum == 1)
            {
                res.append("1");
                carry = 0;
            }else{
                res.append("0");
            }
             
        }
        if(carry == 1)
            res.append("1");

        return res.reverse().toString();
	}    
}
