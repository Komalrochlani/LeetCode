package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(1, "Nik", 86000));
		empList.add(new Employee(2, "zzz", 60000));
		empList.add(new Employee(3, "Nik", 60000));
		Collections.sort(empList);
		System.out.println(empList);
		Collections.sort(empList,new EmployeeSortingName());
		System.out.println(empList);
	}
}
