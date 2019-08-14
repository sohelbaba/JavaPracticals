/**
* This program implements an application that
* simply use of inheritance to the standard output.
*
* @author Mohammed Sohel
* @version 1.0
* @since   2019-07-24
*/
import java.util.*;
class Account
{

	public String Custname;
	public int acno;
	public String type;
	public String Branch;

	/**
	*This Constructor is used to initilize the Account type
	*@param type this is set type of account
	*/
	Account(String type)
	{
		this.type=type;
	}

	/**
	*This Method is used to get Customer information to  the Account
	*@param Custname Name of the customer
	*@param acno Account number  of the customer
	*@param Branch Branch of Account
	*@return Nothing.
	*/
	public void getCustinfo(String Custname,int acno,String Branch)
	{
			this.Custname=Custname;
			this.acno=acno;
			this.Branch=Branch;
	}

	/**
	*This Method is used show the Details of Account
	*@return Nothing.
	*/
	public void displayinfo()
	{
		System.out.println("Customer Name : " +Custname);
		System.out.println("Account Number : " +acno);
		System.out.println("Account Type : " +type);
		System.out.println("Branch Name : " +Branch);
	}


}

class Saving extends Account
{
	public float amount;
	public static final float rate=3.5f;
	public int year;
	public float total;
	public float Calinterest;

	/**
	*This Constructor is used to initilize the Account type
	*@param type this is set type of account
	*/
	Saving(String type)
	{
		super(type);
	}

	/**
	*This Method is used to get Customer information for the Saving Account
	*@param Custname Name of the customer
	*@param acno Account number  of the customer
	*@param Branch Branch of Account
	*@param amount of Account
	*@param Year of Account
	*@return Nothing.
	*/
	public void getSavinginfo(String Custname,int acno,String Branch,float amount,int year)
	{
		super.getCustinfo(Custname,acno,Branch);
		this.amount=amount;
		this.year=year;
	}

	public void calamount()
	{
		Calinterest = (amount* rate * year)/100;
		total = Calinterest + amount;
	}

	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("Amount : " +amount);
		System.out.println("Interest : " +Calinterest);
		System.out.println("Net Balance : " +total);
	}


}

class FixedDeposit extends Account
{
	public float amount;
	public float rate;
	public int year;
	public float Calinterest;
	public float total;


	FixedDeposit(String type)
	{
		super(type);
	}

	public void getFDinfo(String Custname,int acno,String Branch,float amount,int year)
	{
		super.getCustinfo(Custname,acno,Branch);
		this.amount=amount;
		this.year=year;
	}

	public void getrate()
	{
		if(year <= 2)
			rate =6.5f;
		else if(year > 2 && year <= 5)
			rate =7.5f;
		else if(year > 5 && year <= 10)
			rate=8.5f;
		else if(year > 10)
			rate=9f;
	}

	public void calamount()
	{
		Calinterest = (amount* rate * year)/100;
		total = Calinterest + amount;
	}

	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("Amount : " +amount);
		System.out.println("Interest : " +Calinterest);
		System.out.println("Net Balance : " +total);
	}

}

public class Bank
{
	public static void main(String args[])
	{
		int ch;
		String name;
		int acno;
		float amount;
		String branch;
		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("1.SAVING CLASS ");
		System.out.println("2.FIXED DEPOSIT CLASS ");
		System.out.println("Enter Your Choice : ");
		ch = sc.nextInt();

		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Account Number : ");
		acno=sc.nextInt();
		System.out.println("Enter Branch Name : ");
		branch = sc.next();
		System.out.println("Enter Amount : ");
		amount=sc.nextFloat();
		System.out.println("Enter year : ");
		year = sc.nextInt();

		switch(ch)
		{
			case 1:
			 	Saving s1 = new Saving("Saving");
			 	s1.getSavinginfo(name,acno,branch,amount,year);
			 	s1.calamount();
			 	s1.displayinfo();
			 	break;

			case 2:
				FixedDeposit f1 = new FixedDeposit("Fixed");
				f1.getFDinfo(name,acno,branch,amount,year);
				f1.calamount();
				f1.displayinfo();
     			break;

			default:
			  System.out.println("Sorry Enter Proper choice : ");
		}
	}

}