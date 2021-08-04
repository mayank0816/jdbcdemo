package OopsDemo2;

public class SavingsBank extends Account //child class of account
{
	private int min_bal; // can access only within the class
	 protected int balance; // can access within the class and sub class
	 

	public SavingsBank(int accNo, String name, int mb, int b) {
		super(accNo, name);
		
		this.min_bal=mb;
		this.balance=b;
		
	} 
	void display()
    {
            super.display();
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }

}
