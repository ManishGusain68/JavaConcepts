
public class Cuboid {
	
	int length;
	int width;
	int height;
	
	
//	public Cuboid(int length,int width, int height)
//	{
//		this.length=length;
//		this.width=width;
//		this.height=height;
//		
//	}
//	
//	public Cuboid(int length,int width)
//	
//	{
//		this.length=length;
//		this.width=width;
//		this.height=10;
//	}
//	
//	
//	
//	
//	public Cuboid() {
//		this.length=10;
//		this.width=20;
//		this.height=10;
//	}
	
	int getlength() {
		return length;
	}
	void setlength(int length) {
		this.length=length;
	}
	int getwidth() {
		return width;
	}
	void setwidth(int width) {
		this.width=width;
	}
	int getheight() {
		return height;
	}
	void setheight(int height) {
		this.height=height;
	}
	
     int volume() {
    	 return length*width*height;	
}
	

	public static void main(String args[])
	{
//		Cuboid cb=new Cuboid (10,20,30);
//		int out= cb.volume();
//		
//		System.out.println("output of first object :"+out );
//		Cuboid cb1=new Cuboid(20,30);
//	
//		int out1=cb1.volume();
//		System.out.println("output of second object :"+out1 );
		Cuboid cb2=new Cuboid();
		cb2.setheight(10);
		cb2.setlength(20);
		cb2.setwidth(10);
	int out2=cb2.volume();
	System.out.println("output of third	 object :"+out2 );
		
		
	
		
	}
	
	
	
	
	

}
