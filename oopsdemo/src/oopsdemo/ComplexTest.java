package oopsdemo;

public class ComplexTest {

	public static void main(String[] args) 
	{
		Complex c1=new Complex(10.3, 67.4);//invoke constructor
		Complex c2=new Complex(0.7, 3.6);
		c1.add(c2); //calls method adds by passing object c2
		System.out.println("The addition of complex number is: ");
		c1.display();
	}

}
