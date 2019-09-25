class Thread1 implements Runnable
{
	public String name;
	public int tot;
	public Thread1(String name)
	{
		this.name = name;
	}

	public void run()
	{
		tot=Add();
		System.out.println("Thread 1 : " + Add());
	}

	public int Add()
	{
		int sum = 0;
		for(int i=1;i<=10000;i++)
		{
			sum = sum + i;
		}
		return sum;
	}

}

class Thread2 implements Runnable
{
	public String name;
	public int tot;
	public Thread2(String name)
	{
		this.name = name;
	}

	public void run()
	{
		tot = Add();
		System.out.println("Thread 2 : " + Add());
	}

	public int Add()
	{
		int sum = 0;
		for(int i=10001;i<=20000;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}

class Thread3 implements Runnable
{
	public String name;
	public int tot;
	public Thread3(String name)
	{
		this.name = name;
	}

	public void run()
	{
		tot = Add();
		System.out.println("Thread 3 : " + Add());
	}

	public int Add()
	{
		int sum = 0;
		for(int i=20001;i<=30000;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class Multi_Thread_Example
{
	public static void main(String args[])
	{
		Thread1 Th1 = new Thread1("Thread 1");
		Thread t1 = new Thread(Th1);
		t1.start();


		Thread2 Th2 = new Thread2("Thread 2");
		Thread t2 = new Thread(Th2);
		t2.start();


		Thread3 Th3 = new Thread3("Thread 3");
		Thread t3 = new Thread(Th3);
		t3.start();

		int tot=0;
		tot = Th1.tot + Th2.tot + Th3.tot;
		System.out.println("Total : "+tot);
	}
}