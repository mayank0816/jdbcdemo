package oopsdemo;
class Test{
	
	public void finalize() //Override finalize() method of object class
	{
		System.out.println("Objects destroyed and garbage collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1= new Test(); //initialize object-call DEFAULT constructor
		Test t2=new Test();
		
		t1=null;//de-allocate memory
		t2=null;
		
		System.gc();//invoke service method gc()--> invoke finalize()
		
		System.out.println("In  Main method");
		

	}

}
