package methodoverriding;

public class MountainBike extends Bicycle {
	
	 int seatHeight=10;
	
	public MountainBike ( int seatHeight, int gear, int speed) {
		super (gear,speed);
		this.seatHeight=seatHeight;
	}
	
	public MountainBike(int gear) {
		super(gear);
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public void applyBrake(int decrement) {
		this.speed =speed-decrement-10;
		
	}

}
