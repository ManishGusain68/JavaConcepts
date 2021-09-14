package methodoverriding;

public class Bicycle {
	
	int gear;
	protected int speed;
	
	public Bicycle (int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public Bicycle(int gear) {
		
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
public void applyBrake(int decrement) {
	this.speed -=decrement;
	
}

public  void speedUp(int increment) {
	this.speed += increment ;
}

	
	
}
