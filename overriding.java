


class Shape 
{
	 void draw()
	 {
		 System.out.println("Drawing a shape ");
	 }
	  void erase()
	  {
		  System.out.println("Erasing a shape ");
	  }
}
 class Circle extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing a circle ");
	 }
	 void erase()
	 {
		 System.out.println("Erasing a circle ");
	 }
 }
 class Triangle extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing a triangle ");
	 }
	 void erase()
	 {
		 System.out.println("Erasing a triangle ");
	 }
 }
 class Square extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing a Square ");
	 }
	 void erase()
	 {
		 System.out.println("Erasing a square");
	 }
 }
public class Print
 {
	 public static void main(String[] args)
	 {
		 Shape s1= new Shape();
		 Shape s2= new Circle();
		 Shape s3= new Triangle();
		 Shape s4= new Square();
		 s1.draw();
		 s1.erase();
		 s2.draw();
		 s2.erase();
		 s3.draw();
		 s3.erase();
		 s4.draw();
		 s4.erase(); 
	 }
 
