package CollectionsDemo;
import java.util.*;
//hashset with user defined objects
public class HashSetDemoUserDefine {

	public static void main(String[] args) {
		Set <Customer> customers=new HashSet<Customer>();
 //add new customer objects
		customers.add(new Customer(101, "Arun", "Bengaluru"));
		customers.add(new Customer(102, "Mayank", "Noida"));
		customers.add(new Customer(103, "Ishika", "Kanpur"));
		customers.add(new Customer(104, "Pranshu", "Lucknow"));
		customers.add(new Customer(105, "Tanu", "Kalyanpur"));
		
		
		
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		//add duplicate customer
		customers.add(new Customer(103, "Ishika", "Kanpur"));
		
		System.out.println(customers);
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
	}

}
