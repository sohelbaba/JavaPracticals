import java.util.*;
class Employee
{
	public int emp_id;
	public String name;
	public float Salary;

	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Id : ");
		emp_id=sc.nextInt();
		System.out.println("Employee Name : ");
		name = sc.next();
		System.out.println("Employee Salary : ");
		Salary = sc.nextFloat();
	}

	void display()
	{
		System.out.println("Employee Id : "+emp_id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+Salary);
	}
}

class Manager implements Cloneable
{
	public Employee e;

	public Manager()
	{
		e= new Employee();
	}

	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

	public void data()
	{
		e.getdata();
	}

	public void show()
	{
		e.display();
	}
}


public class Company
{
	public static void main(String argts[])
	{
		try{
		Manager m  = new Manager();
		m.data();
		m.show();

		Manager m1 = (Manager)m.clone();
		System.out.println("After Clonning ");
		m1.show();

	}
	catch(CloneNotSupportedException c){}
	}
}