package methodoverloading;

public class MethodOverloadingDemo {
	
	public int multiply(int x, int y) {
		return (x * y);
		
	}

	public int multiply(int x, int y, int z) {
		return (x * y * z);
		
	}
	public double multiply(double x, double y) {
		return (x * y);
		
	}
	
	public static void main(String args[])
	{
		MethodOverloadingDemo mol=new MethodOverloadingDemo();
        System.out.println(mol.multiply(10, 10));
        System.out.println(mol.multiply(10, 10.10));
        System.out.println(mol.multiply(10, 10,10));
        
	}
	
}
