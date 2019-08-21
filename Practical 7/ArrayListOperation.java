import java.util.Collections;
import java.util.*;

public class ArrayListOperation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------Menu------------------------------");
		System.out.println("1. ADD ELEMENT");
		System.out.println("2. ADD ELEMENT SPECIFIC INDEX");
		System.out.println("3. REMOVE ELEMENT(OBJECT)");
		System.out.println("4. REMOVE ELEMENT(INDEX)");
		System.out.println("5. SORTING");
		System.out.println("6. REPLACE ELEMENT AT INDEX");
		System.out.println("7. GET VALUE FROM INDEX");
		System.out.println("8. DISPLAY ALL ELEMENT(ITRATOR)");
		System.out.println("9. Exit");

		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		List l = new ArrayList();

		do{
			switch(ch)
			{
				case 1:
					Collections.addAll(l,10,20,30,40,50,60);
					break;

				case 2:
					l.add(2,2);
					break;


			}
	}while(ch !=9);
	}
}