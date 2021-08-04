package oopsdemo;

public class emp1 {

	public static void main(String[] args) {
		
			    EmployeeInformation e1 = new EmployeeInformation("Robert", 1994, 500000, "64C- WallsStreet");
			    EmployeeInformation e2 = new EmployeeInformation("Sam", 2000, 740000, "68d- WallsStreet");
			    EmployeeInformation e3 = new EmployeeInformation("John", 1999, 600000, "26B- WallsStreet");
			    System.out.println("Name\t Year of joining\t Salary\t Address");
			    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
			    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
			    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
			  }
			

	}

