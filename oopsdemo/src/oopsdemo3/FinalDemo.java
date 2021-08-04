package oopsdemo3;
class Hello
{
	final void display()
	{
		System.out.println("This is a final method");
	}
}
/*class World extends Hello //cannot be extended
{
	final void display() //final methods can not be overridden
	{
		System.out.println("This is final method");
	}


	
}*/
public class FinalDemo {

	public static void main(String[] args) {
		final int AGE=20;//age=30--Compilation error---final can not be changed
		final float PI=3.142f;
		
		
		

	}

}
