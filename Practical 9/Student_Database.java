import java.sql.*;
import java.util.*;
class db_Connection{

	public Connection conn;
	public db_Connection()
	{
		try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				//System.out.println("Connection Eastablish");
		}
		catch(Exception e )
		{
			System.out.println("Error : " + e.toString());
		}
	}
}

public class Student_Database
{
	public static void main(String args[])
	{
		try{
				Scanner sc = new Scanner(System.in);
				db_Connection db = new db_Connection();
				System.out.println("1. INSERT DATA");
				System.out.println("2. UPDATE DATA");
				System.out.println("3. DELETE DATA");
				System.out.println("4. SHOW DATA");
				System.out.println("5. EXIT");
				System.out.println("ENTER YOUR CHOICE : ");
				int ch = sc.nextInt();

			do{
				switch(ch)
				{
					case 1:
						System.out.println("Enter Student Id : ");
						int id = sc.nextInt();
						System.out.println("Enter First Name : ");
						String fname = sc.next();
						System.out.println("Enter Surname : ");
						String sname = sc.next();
						System.out.println("Enter Branch : ");
						String branch = sc.next();
						System.out.println("Enter Semester : ");
						String sem = sc.next();
						System.out.println("Enter City : ");
						String city = sc.next();
						System.out.println("Enter Contact Number");
						String phno = sc.next();

						String query = " insert into Student (S_id, F_name,Surname,Branch,Semester,City,Mobileno)"
								        + " values (?, ?, ?, ?, ?,?,?)";
						PreparedStatement preparedStmt = db.conn.prepareStatement(query);
						preparedStmt.setInt(1,id);
						preparedStmt.setString(2,fname);
						preparedStmt.setString(3,sname);
						preparedStmt.setString(4,branch);
						preparedStmt.setString(5,sem);
						preparedStmt.setString(6,city);
						preparedStmt.setString(7,phno);
						preparedStmt.execute();
						break;

					case 2:
						System.out.println("Enter Id : ");
						int s_id =sc.nextInt();
						String query1 = "Select * from Student wherer S_id = s_id";
						Statement st = db.conn.createStatement();
						ResultSet rs = st.executeQuery(query1);

						while(rs.next())
						{
							System.out.println(rs.getInt("S_id")+" "+rs.getString("F_name") + " " +
							rs.getString("Surname") +" "+rs.getString("Branch") + " "+rs.getString("Semester")
							+ " "+rs.getString("Mobileno"));
						}

						break;


				}
			}while(ch != 5);

			db.conn.close();

		}
		catch(Exception e)
		{
			System.out.println("Error : " + e.toString());
		}

		//ResultSet rs=stmt.executeQuery("select * from Student");
		/*while(rs.Next())
		{

		}*/

	}
}





