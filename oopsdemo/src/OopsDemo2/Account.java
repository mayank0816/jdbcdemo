package OopsDemo2;
//Multilevel Inheritance

public class Account { //base class for saving account
 int accNo;
 String name;
public Account(int accNo, String name) {
	this.accNo = accNo;
	this.name = name;
}
 
void display()
{
	System.out.println("**********Account Details***************");
	System.out.println("Account number:" +accNo);
	System.out.println("Customer name: " +name);
}

}
