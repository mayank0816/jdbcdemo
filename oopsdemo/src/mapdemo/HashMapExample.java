package mapdemo;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
	HashMap<String, Double> hm=new HashMap<String, Double>();
	hm.put("John", 500.50);
	hm.put("Jim", 4200.50);
	hm.put("Daisy", 6700.50);
	hm.put("Jack", 140.21);
	hm.put("Mike", 10000.90);
	
	
	   //iterate true keys
    System.out.println("Display customers & Balance amount: ");
    for(String k:hm.keySet())
    {
    	
		System.out.println(k+"-->"+hm.get(k));
    	
    }
    
    
    
    //deposit 1000 to Jim account
    double bal=hm.get("Jim");
    hm.put("Jim", bal+1000);
    System.out.println("Jim new balance is: "+hm.get("Jim"));
hm.putIfAbsent("Raj",  5000.50);
System.out.println(hm);
	
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Customer Name for his Balance :");
    String name=s.next();
    System.out.println("The Balance of "+name+ " is :"+hm.get(name));
	}

}
