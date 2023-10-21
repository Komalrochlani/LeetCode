package com.code;

public class KJump {

	public static void main(String[] args) {

		int k= 76;
		//10
		int[] arr = {6661,31326,16262,17504,25617,14519,9287,22269,2269,22185};
		int result = kjump(arr, k);
		System.out.println(result);
	}
	
	static int kjump(int[] A, int K){
        // Returns the length of longest subsequence
        int len = A.length;
        int jump = 0,longLength=0;
        for(int i=0; i<len; i++)
        {
            jump=0;
            for(int j=i+1; j<len; j++)
            {
            	
                if((A[j] - A[i]) >= K)
                {
                	System.out.println(A[j] - A[i]);
                    jump++;
                }
            }

            if(longLength < jump)
            {
                longLength=jump;
                System.out.println("jump" + jump);
            }
            System.out.println();

        }
        return longLength;
    }
}
