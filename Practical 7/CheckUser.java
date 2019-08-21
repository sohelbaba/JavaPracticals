import java.util.*;
class User
{
	public String username;
	public int semester;

	public void get_details(String username,int semester)
	{
		this.username = username;
		this.semester = semester;
	}

	public void display()
	{
		System.out.println("Username : "+username);
		System.out.println("Semester : "+semester);
	}
}

public class CheckUser{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String username;
	 	int semester;

		User u = new User();
		try{
			System.out.println("Enter UserName : ");
			username =sc.next();
			System.out.println("Enter Semester : ");
			semester = sc.nextInt();
			u.get_details(username,semester);
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Error : "+e1.toString());
		}
		catch(Exception e){
			System.out.println("Error : "+e.toString());
		}

		finally
		{
			System.out.println("Final block Execute");
		}
	}
}