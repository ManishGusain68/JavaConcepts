package abstration;

public class AbstractionDemo {
	
	public static void main(String[] args)
	{
		GraphicObject gc =new Circle(); // gc is object of Circle with reference of GraphicObject
		gc.draw();
		gc.resize();
		gc.moveTo(2,3);
		
		GraphicObject gc2=new Rectangle();
		gc2.draw();
		gc2.resize();
	}
	

}
