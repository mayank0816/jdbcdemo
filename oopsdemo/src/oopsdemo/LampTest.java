package oopsdemo;
class Lamp
{
	//stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;
	//method to turn on the light
	  void turnOn()
	  {
		  isOn=true;
		  System.out.println("*******LIGHT ON?*******" +isOn);
	  }
	  //method to turnOff the light
	  void turnOff()
	  {
		  isOn=false;
		System.out.println("*******LIGHT ON?*******" +isOn);
	  }
}

public class LampTest {

	public static void main(String[] args) {
		//create object LED AND HALOGEN
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		//switch on
		led.turnOn();
		halogen.turnOn();
        //switch off
		led.turnOff();
		halogen.turnOff();
	}

}
