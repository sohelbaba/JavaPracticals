import java.util.*;
abstract class Geometry
{
	abstract public void perimeter(float f);
}

class Square extends Geometry
{
	public float area;

	public void perimeter(float length)
	{
		area = length *4;
	}

	public void show()
	{
		System.out.println("Perimeter of Square : " + area);
	}
}

class Circle extends Geometry
{
	public float area;
	public static final float pi=3.14f;

	public void perimeter(float diameter)
	{
		area = diameter *pi;
	}

	public void show()
	{
		System.out.println("Perimeter of Circle : " + area);
	}
}

public class Calculate
{
	public static void main(String args[])
	{
		float length;
		float diameter;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Length For Find Perimeter of Square: ");
		length = sc.nextFloat();
		Square s= new Square();
		s.perimeter(length);
		s.show();

		System.out.println("Enter length For Find Perimeter of Circle: ");
		diameter = sc.nextFloat();
		s.perimeter(diameter);
		s.show();
	}
}