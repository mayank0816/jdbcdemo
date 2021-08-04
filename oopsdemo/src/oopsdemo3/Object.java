package oopsdemo3;

public class Object {

	
		    public static void main(String[] args) {
		        Object oc=new Object();
		        System.out.println(oc.hashCode());
		        System.out.println(oc.toString());
		       
		        System.out.println(oc.getClass());
		       
		        Object oc1=new Object();
		        System.out.println(oc1.equals(oc));
		        System.out.println(oc1.hashCode());
		        System.out.println(oc1.toString());
		       
		        Object oc2=oc;
		        System.out.println(oc.equals(oc2));
		        Student s1=new Student(101, "Mayank");
		        Student s2=new Student(101, "Mayank");
		        System.out.println(s1.getClass());
		        s1=s2;
		        System.out.println(s1.equals(s2));
		    }
		}
		 

