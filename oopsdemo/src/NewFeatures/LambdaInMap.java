package NewFeatures;

import java.util.HashMap;
import java.util.Map.Entry;

public class LambdaInMap {

	public static void main(String[] args) {
		HashMap <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        books.forEach((key,value)-> System.out.println("Book Name :"+key +" -Author :" +value));
        System.out.println("Normal way to traverse a map");
        for(Entry<String, String> e:books.entrySet())
        		{
        	System.out.println(e.getKey()+ " " +e.getValue());
        		}
        		

	}

}
