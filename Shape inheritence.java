class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
	void erase()
	{
		System.out.println("Erasing a shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a circle");
	}
	void erase()
	{
		System.out.println("Erasing a circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a triangle");
	}
	void erase()
	{
		System.out.println("Erasing a triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing a square");
	}
	void erase()
	{
		System.out.println("Erasing a square");
	}
}
public class ShapeInherit {
public static void main(String args[])
{
	Shape s1 = new Shape();
	s1.draw();
	s1.erase();
	s1=new Triangle();
	s1.draw();
	s1.erase();
	s1=new Circle();
	s1.draw();
	s1.erase();
	s1=new Square();
	s1.draw();
	s1.erase();
}
}
