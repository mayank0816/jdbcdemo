package exceptiondemo;

public class ThrowExample {
	
	public static void checkEligibilty(int age, int weight)
	{
		if(age<12 && weight<40)
		{
			throw new ArithmeticException("Student is not eligible for Registration");
		}
	
	else
		
	{
		System.out.println("Student with age : "+age+ " and "+weight+" is Eligible");
	}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to sports Eligibility Process: ");
		checkEligibilty(20,45);
		System.out.println("Thank You");
		checkEligibilty(10,39);
	}

}
