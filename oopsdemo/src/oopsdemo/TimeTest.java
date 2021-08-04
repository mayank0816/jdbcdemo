package oopsdemo;

public class TimeTest {

	public static void main(String[] args) {
		Time t1= new Time(02,05,05);
		Time t2=new Time(10,30,30);
		Time t=new Time();
		
		t=t1.add(t2);
	
		t1.display();
		
		t2.display();
	
		t.display();

	}

}
