class Thread_Example1 extends Thread
{
	public String name;
	public Thread_Example1(String name)
	{
		this.name = name;
		System.out.println("Creating Thread : " + name);
	}

	public void run()
	{
		System.out.println("Running Thread : " + name);
		add();
	}

	public void add()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread1 " +i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}
}

class Thread_Example2 extends Thread
{
	public String name;
	public Thread_Example2(String name)
	{
		this.name = name;
		System.out.println("Creating Thread : " + name);
	}

	public void run()
	{
		System.out.println("Running Thread : " + name);
		add();
	}

	public void add()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println("Thread2 " +i);
			try
			{
				sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}
}

class Thread_Example3 extends Thread
{
	public String name;
	public Thread_Example3(String name)
	{
		this.name = name;
		System.out.println("Creating Thread : " + name);
	}

	public void run()
	{
		System.out.println("Running Thread : " + name);
		add();
	}

	public void add()
	{
		int sum = 0;
		for(int i=1;i<=7;i++)
		{
			System.out.println("Thread3 " + i);
			try
			{
				sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}

}

public class MultiThreading
{

	public static void main(String args[])
	{
		Thread_Example1 th1 = new Thread_Example1("First Thread!");
		Thread t1 = new Thread (th1);
		t1.start();
		System.out.println("t1 IsAlive()" +t1.isAlive());
		System.out.println("t1 Priority" +t1.getPriority());
		System.out.println(t1);


		Thread_Example2 th2 = new Thread_Example2("Second Thread!");
		Thread t2 = new Thread (th2);
		t2.start();
		System.out.println("t2 IsAlive()" +t2.isAlive());
		System.out.println(t2);
		System.out.println("t2 Priority" +t2.getPriority());
		System.out.println(t2);

		Thread_Example3 th3 = new Thread_Example3("Thired Thread!");
		Thread t3 = new Thread (th3);
		t3.start();
		System.out.println("t3 IsAlive()" +t3.isAlive());
		System.out.println(t3);
		System.out.println("t3 Priority" +t3.getPriority());
		System.out.println(t3);
	}
}