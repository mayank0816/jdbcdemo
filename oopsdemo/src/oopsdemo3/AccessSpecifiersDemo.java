package oopsdemo3;
class Test{
	int a; //Default variable
	private int b; //Private variable
	protected int c; //protected variable--accessed in sub-class
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public void display()
	{
		System.out.println("Private Variable " +b);
	}
}
class Test2 extends Test{

	public Test2(int a, int b, int c) {
		super(a, b, c);
		
	}
	public void display()
	{
		System.out.println("Protected Variable: "+c);
	}
	
}
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		Test t1= new Test(100,200,300);
		t1.display();
     //   t1.b=50; //compiler error--can not access private variable
		System.out.println("Default vaiable: " +t1.a);
	}

}
