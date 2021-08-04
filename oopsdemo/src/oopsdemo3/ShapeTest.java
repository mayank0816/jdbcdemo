package oopsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
	  Shape shape=new Circle(10);
	  
	  System.out.println("Using Interface:" +shape.LABLE);
       shape.draw();
       System.out.println("Area of circle is: "+shape.getArea());
       
       shape=new Rectangle(10, 7);
       
       shape.draw();
       System.out.println("Area of Rectangle is: "+shape.getArea());
	}

}
