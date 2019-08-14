import java.util.*;
class Circle{
	static final double pi=3.14; //constant value
	Circle(float r)
	{
		double ans=0.0d;
		ans = pi * r * r;
		System.out.println("Area of Circle : " + ans);
	}
}
class Tringle{
	Tringle(double l,double b)
	{
		double ans=0.0f;
		ans=0.5 *l*b;
		System.out.println("Area of Tringle : " + ans);
	}
}

class Rectangle{
	Rectangle(float l,float b)
	{
		float ans=0.0f;
		ans=l*b;
		System.out.println("Area of Rectangle : " + ans);
	}
}

public class Area{

	public static void main(String a[])
	{
		float radius,l1,b1,l2,b2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Radius : ");
		radius=s.nextFloat();
		Circle c=new Circle(radius);

		System.out.print("Enter l : ");
		l1=s.nextFloat();
		System.out.print("Enter b : ");
		b1=s.nextFloat();
		Tringle t= new Tringle(l1,b1);

		System.out.print("Enter l : ");
		l2=s.nextFloat();
		System.out.print("Enter b : ");
		b2=s.nextFloat();
		Rectangle r= new Rectangle(l1,b1);

	}
}