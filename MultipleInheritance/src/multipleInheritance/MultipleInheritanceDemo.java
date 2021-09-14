package multipleInheritance;

public class MultipleInheritanceDemo {
	
	public static void main(String[] args) {
		
		MountainBike mb=new MountainBike(10,1,150);
		System.out.println("height is :"+ mb.getSeatHeight());
		System.out.println("gear is :"+ mb.getGear());
		System.out.println("speed is :"+ mb.getSpeed());
		
		mb.applyBrake(100);
		System.out.println("speed after brake :"+ mb.getSpeed());
		mb.canDrive();
		mb.canRotateTwoWheels();
	}

}
