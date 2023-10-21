package com.code.interviewprepration;

public class IsSubSequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("b", "abc"));

	}

	public static boolean isSubsequence(String s, String t) {
		StringBuffer sb = new StringBuffer();
		if (s.length() == 0) {
			return true;
		}

		//char[] newChar = new char[s.length()];

		int h = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.contains("" + t.charAt(i))) {
				//newChar[h++] = t.charAt(i);
				sb.append(t.charAt(i));
			}
		}
//
//		System.out.println(newChar);
//		String sNew = new String(newChar);
//		System.out.println(sNew);
		System.out.println(sb);
		if (new String(sb).contains(s)) {
			return true;
		} else {
			return false;
		}

//		 char[] sArr = s.toCharArray();
//		 char[] tArr = t.toCharArray();
//		 char[] newChar = new char[s.length()];
//		 int j=0;
//		 for(int i=0;i<tArr.length && j<sArr.length;i++) {
//			if(tArr[i] == sArr[j]) {
//				newChar[j] = tArr[i];
//				j++;
//			}
//		 }
//		 System.out.println(new String(newChar));
//		 if(s.equals(new String(newChar))) {
//			 return true;
//		 }
//		 else {
//			 return false;	 
//		 }

	}
}
