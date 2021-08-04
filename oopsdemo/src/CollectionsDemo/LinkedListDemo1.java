package CollectionsDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A LinkedList containing Stock Prices of a company for the last 6 days
        LinkedList<Double> stockPrices = new LinkedList<>();

 

        stockPrices.add(45.00);
        stockPrices.add(51.00);
        stockPrices.add(62.50);
        stockPrices.add(42.75);
        stockPrices.add(36.80);
        stockPrices.add(68.40);
        System.out.println(stockPrices);
        Collections.sort(stockPrices);
        System.out.println(stockPrices);
        Collections.reverse(stockPrices);
        System.out.println(stockPrices);
        
        System.out.println("MAX Stock price :"+Collections.max(stockPrices));
        System.out.println("Minimum Stock price :"+Collections.min(stockPrices));
	
	
	}

}
