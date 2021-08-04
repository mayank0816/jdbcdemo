package OopsDemo2;
//Dynamic Polymorphism

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();
		vObj.drive();
		
		Vehicle vCar=new Car1(); //UPCASTING
		vCar.drive();
		
		Vehicle vTruck=new Truck();
		vTruck.drive();
//		vTruck.load();// C.T. error
			Truck t1=new Truck();
			t1.load();
		

	}

}
