//Barbara Mattler 2/22/16
public class VehicleTester {
	public static void main(String[] args){

		Vehicle c1= new Car();
		System.out.println("Car");
		c1.setSpeed(0);
		c1.Accelerate();
		System.out.println(c1.getSpeed());
		c1.Accelerate();
		System.out.println(c1.getSpeed());
		
		Vehicle c2= new Truck();
		System.out.println("Truck");
		c2.setSpeed(0);
		c2.Accelerate();
		System.out.println(c2.getSpeed());
		c2.Accelerate();
		System.out.println(c2.getSpeed());
	}
}