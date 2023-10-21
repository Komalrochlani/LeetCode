package com.code;

class Score {

	private int run;
	private boolean out;
	
	public Score(int run,boolean out) {
		this.run = run;
		this.out = out;
	}
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public boolean isOut() {
		return out;
	}
	public void setOut(boolean out) {
		this.out = out;
	}
	
	
	
}

public class MainScore{
	
	public static double average(Score[] s)
	{
		int total = 0;
		double noOfOut = 0;
		for(int i=0;i<s.length;i++)
		{
			total += s[i].getRun();
			if(s[i].isOut())
			{
				noOfOut++;
			}
			
		}
		return total/noOfOut;
	}
	
	public static void main(String[] args) {
		
		Score[] s = new Score[5];
		s[0] = new Score(200,false);
		s[1] = new Score(200,false);
		s[2] = new Score(200,false);
		s[3] = new Score(200,false);
		s[4] = new Score(200,false);
		
		System.out.println(average(s));	
		
	}
}