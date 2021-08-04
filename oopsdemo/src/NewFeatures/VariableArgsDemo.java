package NewFeatures;

public class VariableArgsDemo {
	static void fun(String s, int ...a)
	{
		System.out.println("String Passed: "+s);
		System.out.println("No of Arguments: "+a.length);
		//for each loop to display
		for(int i:a)
		{
			System.out.println(i+" ");
		}
		
	}

	public static void main(String[] args) {
	
   fun("JDBC",100, 200);
   fun("Swings", 1, 2, 3, 4, 5, 6, 7);
   fun("MySql");
	}

}
