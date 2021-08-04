package OopsDemo2;

public class Addition {

	void add() {
		System.out.println("Method Overloading Demo");
	}
	
	 void add(int a, int b)
	 {
		 System.out.println("Addition of two numbers: "+(a+b));
	 }
	 
	 void add(float a, float b)
	 {
		 System.out.println("Addition of two float numbers: "+(a+b));
	 }
     
	 void add(int a , int b, int c)
	 {
		 System.out.println("Addition of three numbers: " +(a+b+c));
	 }
	 void add(String s1, String s2)
	 {
		 System.out.println("Addition of two strings: " +(s1+s2));
	 }
	 
}
