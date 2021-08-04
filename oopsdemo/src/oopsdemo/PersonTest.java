package oopsdemo;
import java.util.Scanner;
class Person{
	String name, constituency;
	int age;
	Scanner s;
	
	public Person() { //default constructor
		System.out.println("Voter Eligibilty App");
		age=0;
		name="";
		constituency="Bengaluru";
		s=new Scanner(System.in);
	}

	public Person(String name, int age) { //parametrized constructor two arguments
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	Person(String n, int a, String c){ //parametrized constructor 3 arguments
      name=n;
      age=a;
      constituency=c;
}

	void input()
	{
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your age");
		age=s.nextInt();
	}
	
	void print() {
		
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
				System.out.println("constituency is:" +constituency);
	}
	
	
}


public class PersonTest {

	public static void main(String[] args) {
      Person objPerson1=new Person(); //invoke implicit constructor
      objPerson1.input();
      objPerson1.print();
      System.out.println("----------------");
      Person objPerson2=new Person("Mike", 21); //invoke constructor with two arguments
      objPerson2.print();
      
      System.out.println("----------------");
      Person objPerson3=new Person("Ravi", 60, "Delhi"); //invoke constructor with two arguments
      objPerson3.print();
	}

}
