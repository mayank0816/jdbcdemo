package oopsdemo;

public class studentTest {

	public static void main(String[] args) {
		// create an Object of student class
		Student s1=new Student(0, null, 0);
		Student s2=new Student(0, null, 0);
		//invoke methods of Student class using Dot Operator
		s1.input();
		float total1=s1.calculate();
		s1.display();
		System.out.println("Total Displayed from Main:" +total1);
		
		s2.input();
		float total2=s2.calculate();
		s2.display();
		System.out.println("Total Displayed from Main:" +total2);


	}

}
