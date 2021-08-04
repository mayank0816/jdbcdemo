package OopsDemo2;

class Bank{
	int getRateOfInterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to BANK");
	}
}
class SBI extends Bank
{
	int getRateOfInterest() //overridden method
	{
		return 5;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest() //method overridden in Child Class
	{
		return 7;
		}
}
class AXIS extends Bank
{
	int getRateOfInterest() //method overridden in Child Class
	{
		return 6;
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		AXIS b3=new AXIS();
		
		b1.display();
		System.out.println("The rate of Interest of SBI is : " +b1.getRateOfInterest());
		b2.display();
		System.out.println("The rate of Interest of ICICI is : " +b2.getRateOfInterest());
		b3.display();
		System.out.println("The rate of Interest of AXIS is : " +b3.getRateOfInterest());
	}

}
