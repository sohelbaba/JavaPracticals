import java.util.*;
class UserNameException  extends Exception
{
	public String Username;
	public UserNameException(String Username)
	{
		this.Username= Username;
	}

	public String toString()
	{
		return ("You Have Entered invalid username : "+Username);
	}

}

public class ExceptionExample{

	boolean check(String s)
	{
	    if (s == null)
	       return false;

	      int len = s.length();

	      for (int i = 0; i < len; i++)
	      {
	         if ((Character.isLetter(s.charAt(i)) == false))
	         {
	            return false;
	         }
	      }
	      return true;
	 }



	public static void main(String args[])
	{
		ExceptionExample ee = new ExceptionExample();
		String u = "sohel!@#";
		try{
			if(u.length() > 4 && u.length() < 10 && ee.check(u) == true)
			{
				System.out.println("username : "+u);
			}
			else
			{
				throw new UserNameException(u);
			}
		}catch(Exception e){
		System.out.println("Exception : "+e.toString());
		}
	}
}