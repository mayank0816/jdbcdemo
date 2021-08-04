package oopsdemo;
import java.util.Scanner;
public class RectanglTest {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	        int l,b;
	        System.out.println("Enter the lengyh of Rectangle");
	         l = s.nextInt();
	        s.nextLine();
	        System.out.println("Enter the breadth of Rectangle");
	        b = s.nextInt();
			Area ob1 = new Area(l,b);
	        System.out.println("Area = "+ ob1.AreaReturn());
	    }
	

	}

