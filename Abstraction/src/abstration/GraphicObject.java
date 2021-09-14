package abstration;

public abstract class GraphicObject {
	
int x,y;

GraphicObject(){
	System.out.println("abstract class constructor");
}
void moveTo(int newX, int newY){
	System.out.println("move to x:"+ newX+"move to y:"+ newY);
	
}

abstract void draw();
abstract void resize();


}
