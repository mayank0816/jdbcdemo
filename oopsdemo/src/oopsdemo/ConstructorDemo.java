package oopsdemo;

public class ConstructorDemo {
   int id;
   String name;
   float salary;
   
   ConstructorDemo()         //IMPLICIT CONSTRUCTOR
   {
   
	   System.out.println("I am Default constructor");
         id=0;
         name=" ";
         salary=5000.00f;
   }
   void display() {
	   System.out.println(salary);
	  
   }
	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo(); //invoke implicit constructor
		ConstructorDemo cd2=new ConstructorDemo(); 
		ConstructorDemo cd3=new ConstructorDemo(); 
		cd1.display();
	}

}

//int a;//variable declaration
