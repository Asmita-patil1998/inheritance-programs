class Shape
{
		void draw()
		{
			System.out.println("I am Shape");
		}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("I am Circle");
	}

}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("I am Polygon");
	}

}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("I am Rectangle");
	}

}
public class ShapeDemo {

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		Shape s1 = new Circle();
		Shape s2 = new Polygon();
		Shape s3 = new Rectangle();
	
		s.draw();
		s1.draw();
		s2.draw();
		s3.draw();
	}

}