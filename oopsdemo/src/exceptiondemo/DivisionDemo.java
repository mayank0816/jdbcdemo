package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;  
         Scanner input = new Scanner(System.in);
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  
          try {
        	  result = a / b;  
              System.out.println("Result = " + result);
          }
          catch(ArithmeticException e)
          {
        	  System.out.println("Divide by zero error");
        	  System.out.println("Exception: "+e.getMessage());
        	  System.out.println("Exception name & Description: "+e.toString());
        	  e.printStackTrace();
        	  
          }

          finally
          
          {
        	  input.close();
        	  System.out.println("In finally Block--Program Execution ended");
          }
          

	}

}
