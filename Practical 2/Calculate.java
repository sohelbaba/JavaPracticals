import java.util.*;
class Sum{
	void sum(){
		int n1,n2,ans;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		n1=s.nextInt();
		System.out.print("Enter Number 2 : ");
		n2=s.nextInt();
		ans=n1+n2;
		System.out.println(" Sum = " + ans );
	}

	void sum(int n1,int n2)
	{
		int ans;
		ans=n1+n2;
		System.out.println("Sum = " + ans);
	}

	void sum(float n1,float n2)
	{
		float ans=0.0f;
		ans=n1+n2;
	    System.out.println("Sum = " + ans);
	}

	void sum(double n1,double n2)
	{
	    double ans=0.0d;
		ans=n1+n2;
	    System.out.println("Sum = " + ans);
	}

	void sum(int n1)
	{
			int ans,x=10;
			ans=n1+x;
		    System.out.println("Sum = " + ans);
	}

}
public class Calculate{

	public static void main(String a[])
	{
		Sum obj = new Sum();
		obj.sum();

		System.out.println("Additon of Interger Value : ");
		int no1,no2;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		no1=x.nextInt();
		System.out.print("Enter Number 2 : ");
		no2=x.nextInt();
		obj.sum(no1,no2);

		System.out.println("Additon of Float Value : ");
		float fno1,fno2;
		Scanner x1=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		fno1=x1.nextFloat();
		System.out.print("Enter Number 2 : ");
		fno2=x1.nextFloat();
		obj.sum(fno1,fno2);

		System.out.println("Additon of Double Value : ");
		double dno1,dno2;
		Scanner x2=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		dno1=x2.nextDouble();
		System.out.print("Enter Number 2 : ");
		dno2=x2.nextDouble();
		obj.sum(dno1,dno2);

		System.out.println("Additon of Single Value : ");
		int sno1;
		Scanner x3=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		sno1=x3.nextInt();
		obj.sum(sno1);


	}
}