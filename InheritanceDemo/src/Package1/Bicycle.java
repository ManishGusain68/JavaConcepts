package Package1;

 public class Bicycle {
	
	protected int gear;
	protected int speed;
	protected int regno;
	
	public Bicycle(int startspeed, int startgear) {
		
		gear= startgear;
		speed=startspeed;
}
public Bicycle(int regno) {
		
	this.regno=regno;
}
	public void setGear(int newvalue) {
		gear=newvalue;
	}
	
	public void applybreak(int decrement) {
		speed -= decrement;
		
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	

}
