package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		//create primitivedata types
		int a=5;
		float b=10.10f;
		
		Integer aObj=a;  //Auto-boxing--converting primitive(value type to object)
		Float bObj=b;
		
		//create wrapper class objects
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(2000.0);
		
		//converting into primitive types
		int p=x.intValue();   //Auto-Unboxing --convertingObj to value types
		double q=y.doubleValue();
		
		System.out.println(p+ " "+q);
		System.out.println(aObj+ " " +bObj);
		
		char e='a';
		Character objE=e;
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
		Double d=200.5;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
		
		
		
		
		
		
		
		

	}

}
