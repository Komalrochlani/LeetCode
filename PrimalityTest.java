package com.code.interviewprepration;

import java.math.BigInteger;

public class PrimalityTest {

	public static void main(String[] args)  {
		
        String n = "34263233064835421125264776608163440537925705997962346596977803462033841059628723";
        if(new BigInteger(n).isProbablePrime(1))
        {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
       
    }
	
}
