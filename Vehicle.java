//Barbara Mattler 2/22/16
public class Vehicle {
	public int speed;
	
	public int Accelerate()
	{
		speed += 5;
		
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}
