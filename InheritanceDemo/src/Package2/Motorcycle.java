package Package2;

import Package1.Bicycle;

public class Motorcycle extends Bicycle{
	
	public int numberOfTyre;
	
	public Motorcycle(int noofTyre,int speed, int gear) {
		super(speed,gear);
		
		
		
	}
	
	public void showTyre( int tyre) {
		System.out.println("nof of tyre in bike is :" + tyre);
		
	}

}
