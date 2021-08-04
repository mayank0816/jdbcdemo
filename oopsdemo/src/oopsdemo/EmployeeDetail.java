package oopsdemo;

public class EmployeeDetail {
String Name;
float salary, hours;
    public EmployeeDetail() {
	    Name = " ";
	    salary = 0;
	    hours = 0;
}
    public void getInfo(String n,float sal, float hrs) {
    	Name=n;
    	salary=sal;
    	hours=hrs;
    }
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}

}
