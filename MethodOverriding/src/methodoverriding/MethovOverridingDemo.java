package methodoverriding;

public class MethovOverridingDemo {

	public static void main(String[] args) {
		MountainBike mb=new MountainBike (2,2,150);
		System.out.println("Seat height is :"+ mb.getSeatHeight());
		//MountainBike mb2=new MountainBike (2);
		//System.out.println("static Seat height is :"+ mb2.getSeatHeight());
//		System.out.println("gear is :"+ mb.getGear());
//		System.out.println("speed is :"+ mb.getSpeed());
//		
//		mb.applyBrake(20);
//		System.out.println("new speed is :"+ mb.getSpeed());
		
		Bicycle b=new MountainBike(1,1,120);  // Dynamic object binding concept or dynamic binding concept
        b.applyBrake(100); 
        System.out.println("new speed is :"+ b.getSpeed());
	}
}
