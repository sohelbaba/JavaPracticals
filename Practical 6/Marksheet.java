import java.util.*;
class Student{

	int rollno;
	String name;

	Sessional s;

	public Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name= name;
		s= new Sessional();
	}



	void display()
	{
		s.getmarks();
		int tot = s.gettotal();
		float per = s.getper();
		System.out.println("Roll Number : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Total : "+tot);
		System.out.println("Percentage : "+per);

	}

	class Sessional{

		public int sub[];
		public int total=0;
		public Sessional()
		{
			sub = new int[5];
		}

		public void getmarks()
		{
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter Subject : ["+i+"] Marks : ");
				sub[i] = sc.nextInt();
			}


		}

		public int gettotal()
		{
			for(int i=0;i<5;i++)
			{
				total = total + sub[i];
			}

			return total;
		}

		public float getper()
		{
			float per;
			per =(total/5);
			return per;

		}
	}
}

public class Marksheet{
	public static void main(String args[])
	{
		Student s= new Student(101,"Sohel");
		s.display();
	}
}