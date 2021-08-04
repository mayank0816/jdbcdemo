package exceptiondemo;
import java.util.*;
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckingAccount c1=new CheckingAccount(101);
System.out.println("Depositing 3000...........");
	c1.deposit(3000);
	try {
		System.out.println("withdrawing 1000$");
		c1.withdraw(1000);
		System.out.println("withdrawing 6000$");
		c1.withdraw(6000);
	}
	
	catch(InsufficientFunds e)
	{
		System.out.println("sorry "+c1.getBalance());
		e.printStackTrace();
	}
	}

}