package Package1;

public class MountainBike extends Bicycle {

	int seatHeight;
	
	public MountainBike (int startHeight, int startSpeed, int startgear)
	{
		super(startSpeed,startgear);  //this has to be the first line in the subclass constructor
		seatHeight=startHeight;
	}
	
	
	public MountainBike(int regno , int seatht) {
		super(regno);
		this.seatHeight=seatht;
	}
	public void setHeight(int newValue) {
		seatHeight= newValue;
	}
}
