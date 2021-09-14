package multipleInheritance;

public class MountainBike extends TwoWheeler implements Bicycle,Vehicle {
	private int seatHeight;
	private int gear;
	private int speed;
	
	MountainBike(int seatHeight, int gear, int speed){
		this.seatHeight = seatHeight;
		this.gear=gear;
		this.speed=speed;
		
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
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
	@Override
	public void applyBrake(int decrement) {
	this.speed -= decrement;
		
	}
	@Override
	public void speedUp(int increment) {
		this.speed += increment;
		
	}

	@Override
	public void canDrive() {
		System.out.println("mountain bike can be driven");
		
	}
	
	

}
