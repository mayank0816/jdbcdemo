package OopsDemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
		//invoke add overload method
		a1.add();
		a1.add(20,30);
		a1.add(25.5f, 358.6f);
		a1.add(300, 500, 400);
		a1.add("Hello","World");
		
		

	}

}
