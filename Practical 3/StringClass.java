import java.util.*;
public class StringClass
{
	public static void main(String args[])
	{
		String str,str1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		str=sc.nextLine();

		System.out.print("Enter String : ");
		str1=sc.nextLine();

		String s = new String(str);
		System.out.println("String Constructor : " +s);

		char c[] = {'A','B','C','D','E','F','G'};
		String s1 = new String(c);
		System.out.println("String Constructor : " +s1);

		byte b[] = {65,66,67,68,69,70,71,72};
		String b1 = new String(b);
		System.out.println("String Constructor : " +b1);

		String s2 = new String(c,2,4);
		System.out.println("String Constructor : " +s2);

		int l= str.length();
		System.out.println("lenght of String : " +l);

		char cl=str.charAt(3);
		System.out.println("char at String : " + cl);

		int uni=str.codePointAt(3);
		System.out.println("unicode String : " + uni);

		String lower = str.toLowerCase();
		System.out.println("lower of String : " + lower);

		String upper = str.toUpperCase();
		System.out.println("upper of String : " + upper);

		String con = str.concat(str1);
		System.out.println("concate of String : " + con);

	}
}