import java.util.*;
public class UserNameException extends Exception
{
	public String Username;
	public UserNameException(String Username)
	{
		this.Username= Username;
	}

	public String toString()
	{
		return "Username cannot be containf any other charcter";
	}

}

public class ExceptionExample{

	public static void main(String args[])
	{
		String u = "sohel";
		if(u.length() > 4  && u.length() < 10)
		{
			throw new UserNameException(u);
		}
		else
		{
			System.out.println("username : "+u);
		}
	}
}