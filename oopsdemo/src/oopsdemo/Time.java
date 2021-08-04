/* Java program to perform addition of 2 Time
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */



package oopsdemo;

public class Time {
 int hrs, min, sec;

 Time()
 {
	 hrs=min=sec=0;

 }
 Time(int h, int m,int s)
 {
	 hrs=h;
	 min=m;
	 sec=s;
 }
public Time add(Time t2)
 {
	 Time t=new Time();
	 t.hrs=hrs+t2.hrs;
	 t.min=min+t2.min;
	 t.sec=sec+t2.sec;
	 if(t.sec>=60)
	 { 
		 t.min=t.sec/60;
		 t.sec=t.sec%60;
	 }
	 if(t.min>=60)
	 {
		 t.hrs=t.min/60;
		 t.min=t.sec%60;
	 }
	 return(t);
		 
 }
 
 void display()
	{   
	   System.out.println("-------------------------");
		System.out.println(hrs+ ":"+min+ ":"+sec);
	}
}