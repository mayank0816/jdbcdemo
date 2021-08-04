package oopsdemo;
import java.util.Scanner;
//instance class
public class Student {

		//properties
		int rollNumber;
		String name, course;
		float m1,m2,m3,total;
		Scanner sc= new Scanner(System.in);
		public Student(int i, String string, int j) {
			// TODO Auto-generated constructor stub
		}

//methods
void input()
{
	System.out.println("Enter Roll no, Name, course:");
	rollNumber=sc.nextInt();
	name=sc.next();
	course=sc.next();
	
	System.out.println("Enter marks of three subjects: ");
	
	m1=sc.nextFloat();
	m2=sc.nextFloat();
	m3=sc.nextFloat();
	
}

float calculate()
{
	total=m1+m2+m3;
	return total;
}
void display()
{
	System.out.println("*************STUDENT DETAILS****************");
	System.out.println("Roll Number : "+rollNumber);
	System.out.println("Name: " +name);
	System.out.println("Course: " +course);
	System.out.println("Total Marks: " +total);
	System.out.println("*********************************************");
}
}


