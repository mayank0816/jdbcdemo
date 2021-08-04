package oopsdemo;

import java.io.IOException;

public class Streams {

	public static void main(String[] args) throws IOException {


    int ch1 = 0;
    System.out.println("Enter Your Text, Use # for termination");
                      
    while((ch1 = System.in.read()) != '#') //read exactly one byte
      System.out.print((char)ch1);
    System.out.println("Terminated");
  
	}
}

	
