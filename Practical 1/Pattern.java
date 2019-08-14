public class Pattern{
	public static void main(String a[])
	{
		int i,j;
		for(i=1; i<=3; i++)
		{
		    for(j=1; j<=2*3; j++)
		    {
		       	if(i<j)
		        {
					System.out.print("");
				}
				else
				{
				\	System.out.print("A");
				}
				if(i<=(2*3) - j)
				{
					System.out.print("");
				}
				else
				{
					System.out.print("A");
				}
		    }
		    System.out.println();
        }
        for(i=1; i<=3; i++)
		{
			for(j=1; j<=2*3; j++)
		    {
				if(i<j)
					System.out.print(" ");
				else
					System.out.print(" ");
			}
		}

	}
}
