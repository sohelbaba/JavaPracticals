import java.util.*;
public class Matrix{
	/*void read(int r1,int c1,int r2,int c2)
	{
		if(c1 == r1)
		{
			int m1[][] = new int[r1][c1];
			int m2[][] = new int[r2][c2];

			//Matrix 1
			System.out.print("Enter Data in Matrix1 :  ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print("Matrix 1 : [" + r1 + "][" + c1 + "] :");
					m1[r1][c1] =s.nextInt();
				}
			}

			//Matrix 2
			System.out.print("Enter Data in Matrix1 :  ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print("Matrix 2 : [" + r2 + "][" + c2 + "] :");
					m2[r2][c2] =s.nextInt();
				}
			}

			//show the matrix
			System.out.println("Your Matrix is Below :  ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(m1[r1][c1] + " ");
				}
				System.out.println();
			}

			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(m1[r2][c2] + " ");
				}
				System.out.println();
			}

		}
		else
		{
			System.out.print("Matrix Multiplication is not Possible !!!!!");
		}
}*/
		public static void main(String args[])
		{
			int r1,c1,r2,c2;
			Scanner s= new Scanner(System.in);
			System.out.print("Enter Matrix 1 Rows : ");
			r1=s.nextInt();
			System.out.print("Enter Matrix 1 Cols : ");
			c1=s.nextInt();
			System.out.print("Enter Matrix 2 Rows : ");
			r2=s.nextInt();
			System.out.print("Enter Matrix 2 Cols : ");
			c2=s.nextInt();

			if(c1 == r2)
			{
				int m1[][] = new int[r1][c1];
				int m2[][] = new int[r2][c2];

				//Matrix 1
				System.out.println("Enter Data in Matrix1 :  ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						System.out.print("Matrix 1 : [" + i + "][" + j + "] :");
						m1[i][j] =s.nextInt();
					}
				}

				//Matrix 2
				System.out.println("Enter Data in Matrix2 :  ");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						System.out.print("Matrix 2 : [" + i + "][" + j + "] :");
						m2[i][j] =s.nextInt();
					}
				}


				//show the matrix
				System.out.println("Your Matrix is Below :  ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						System.out.print(m1[i][j] + " ");
					}
					System.out.println();
				}

				System.out.println();

				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						System.out.print(m1[i][j] + " ");
					}
					System.out.println();
				}

				int res[][] = new int[r1][c1];

				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						res[i][j]=0;
						for(int k=0;k<r2;k++)
						{
							//System.out.println("Enter");
							res[i][j] += m1[i][k]*m2[k][j];
						}
					}
				}

				System.out.println("matrix Multiplication ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						System.out.print(res[i][j] + " ");
					}
					System.out.println();
				}


		}
		else
		{
			System.out.print("Matrix Multiplication is not Possible !!!!!");
		}
	}
}