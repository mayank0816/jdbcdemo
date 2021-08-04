package OopsDemo2;
/*Multilevel Inheritance */
//Account>>SavingsBank>>AccountDetails
public class AccountDetails extends SavingsBank{
	int withdrawl, deposit, finalBalance;

	public AccountDetails(int accNo, String name, int mb, int b, int w, int dep) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=dep;
	}
	void display()
    {
            super.display(); //invoke savings bank
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("FINAL BALANCE: " +finalBalance);
    }

}
