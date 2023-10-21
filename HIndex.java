package com.code.interviewprepration;

import java.util.Arrays;

public class HIndex {

		public static void main(String[] args) {
			int[] arr = {3,0,1,5,6};
			System.out.println(hIndex(arr));
			System.out.println(Math.min(6, 5-6));
			
		}
		 public static int hIndex(int[] citations) {
		        //[0,1,3,5,6]
		        Arrays.sort(citations); // Sort the citations in ascending order
		        int n = citations.length;
		        int h = 0;
		        
		        for (int i = 0; i < n; i++) {
		            int minCitations = Math.min(citations[i], n - i); // Find the minimum between current citation and remaining papers
		            
		            h = Math.max(h, minCitations); // Update h if a larger H-Index is found
		            System.out.println( i +" "+minCitations + " " + h);
		        }
		        
		        return h;
		    }
}
