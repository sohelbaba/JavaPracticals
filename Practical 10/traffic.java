
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class traffic extends Applet implements Runnable
{
	Thread t1;
	int c=0;

	 public void init()
	{
		t1 = new Thread();
		t1.start();
	}

	public void run()
	{
		try{
			repaint();
			t1.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void paint(Graphics g)
	{
		while(true)
		{
			if(c==0)
			{
				g.drawOval(50,50,50,50);
				//setForeground("orange");
				g.fillOval(50,50,50,50);
				g.setColor(Color.red);
				c=1;
			}
			else if(c == 1)
			{
				g.drawOval(50,100,50,50);
				//setForeground("orange");
				g.fillOval(50,100,50,50);
				g.setColor(Color.orange);
				c=2;
			}
			else if(c == 2)
			{
				g.drawOval(50,150,50,50);
				g.fillOval(50,150,50,50);
				//setForeground("orange");
				g.setColor(Color.green);
				c=0;
			}
		}
	}
}