public class Sort{
   public static void main(String args[]) {

		String temp;
       String s[] = new String[args.length];
       s[0]=args[0];
       s[1]=args[1];
       s[2]=args[2];

		for(String x : s)
		{
			System.out.println(x);
		}


		System.out.println();
       for(int i=0;i<3;i++)
       {
			for(int j=i+1;j<3;j++)
			{
				if(s[i].compareTo(s[j]) > 0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}

		for(String x : s)
				{
					System.out.println(x);
		}
   }
}