package Package1;

import Package2.Motorcycle;

public class MainClass {
 public static void main(String[] args) {
	// MountainBike mb=new MountainBike(20,10,1);
	 MountainBike mb1=new MountainBike(123,2);
//	 System.out.println("Gear is :"+ mb.gear);
//	 System.out.println("speed is :"+ mb.speed);
//	 System.out.println("seat height is :"+ mb.seatHeight);
	 System.out.println("reg no is :"+ mb1.regno);
//	 mb.applybreak(2);
//	 System.out.println("speed is :"+ mb.speed);
	 Motorcycle mc=new Motorcycle(2,10,10);
	 mc.showTyre(2);
	

 }
}
