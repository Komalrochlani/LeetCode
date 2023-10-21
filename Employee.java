package com.code;

public class Employee implements Comparable<Employee>{

	int empno;
	String ename;
	int sal;
	
	public Employee(int empno,String ename,int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}



	@Override
	public int compareTo(Employee o) {
		
		if(this.sal<o.sal)
			return 1;
		else if(this.sal == o.sal)
		{
			return this.ename.compareTo(o.ename);
		}
		else 
			return -1;
	
	}
	
	
}
