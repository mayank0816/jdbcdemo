package oopsdemo;

import java.util.Scanner;

public class Employee {

	
		public static void main (String[] args)
		{
			EmployeeDetail emp = new EmployeeDetail();
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter salary");
			float salary = sc.nextFloat();
			System.out.println("Enter no. of hours of work");
			float hours = sc.nextFloat();
			
		
			emp.getInfo(name, salary, hours);
			salary = emp.AddSal();
			salary = emp.AddWork();
			TestEmployee test = new TestEmployee(salary);
			test.printSal();  
		}
	}

