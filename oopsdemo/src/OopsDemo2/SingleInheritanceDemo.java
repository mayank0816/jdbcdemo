package OopsDemo2;

public class SingleInheritanceDemo {

		public static void main(String[] args) {
			
			Developer d1=new Developer(101,"James Gosling","JDBC");
			Developer d2=new Developer(106,"Mayank Rajput","PYTHON");
			
			Accountant a1=new Accountant(201," Ishika Thakur","Process salary of employee", "SAP");
			Accountant a2=new Accountant(202," Mary John","Payment to vendors", "Tally");
			
			
			d1.display(); // child class object invoke parent class method
			d1.display1(); // child class object invoke child class method
			
			d2.display();
			d2.display1();
			//invoke accountant class method
			a1.display();
			a2.display();

		}
}