package Shapes;

public abstract class Shape {
	abstract void draw();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape R = new Rectangle();
		R.draw();
		Shape L = new Line();
		L.draw();
		Shape C = new Cube();
		C.draw();
		

	}

}
