package OopsDemo2;
class Honda extends car
{

	public void hondaStart()
	{
		Engine heng=new Engine(); //Composition HONDA class fully dependent on Engine
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
Honda hondaCity=new Honda();
hondaCity.setColor("Silver");
hondaCity.setMax_speed(180);
System.out.println( "************HONDA CAR DETAILS***********");
System.out.println(hondaCity.getColor());
System.out.println(hondaCity.getMax_speed());
hondaCity.hondaStart();
	}

}
