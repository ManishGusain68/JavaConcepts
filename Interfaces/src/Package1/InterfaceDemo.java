package Package1;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		MountainBike mounbike=new MountainBike(20,10,1);
		System.out.println("Gearis:"+ mounbike.getGear());
		System.out.println("height is:"+ mounbike.getSeatHeight());
		System.out.println("speed is:"+ mounbike.getSpeed());
		
		mounbike.applyBrake(2);
		System.out.println("speed after applying brake is:"+ mounbike.getSpeed());
		
		mounbike.speedUp(6);
		System.out.println("speed after applying speed up is:"+ mounbike.getSpeed());
		
	}

}
