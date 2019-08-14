import java.util.*;
interface Practical
{
	public void get_practicalmarks(int m1,int m2,int m3);
}

interface External extends Practical
{
	public void get_externalmarks(int m1,int m2,int m3,int m4,int m5);
	public void get_termworkmarks(int m1,int m2,int m3,int m4,int m5);
}

class Sessional
{
	int java;
	int cns;
	int php;
	int isp;
	int python;
	public void get_marks(int java,int php,int isp,int python,int cns)
	{
		this.java = java;
		this.cns=cns;
		this.php =php;
		this.isp = isp;
		this.python = python;
	}

	public int get_total()
	{
		int stot;
		stot = java+php+isp+python+cns;
		return stot;
	}
}

class Result extends Sessional implements External
{
	//practical marks
	int javap;
	int phpp;
	int pythonp;

	//external marks
	int java;
	int cns;
	int php;
	int isp;
	int python;

	//external termwork
	int tjava;
	int tcns;
	int tphp;
	int tisp;
	int tpython;

	public void get_marks(int java,int php,int isp,int python,int cns)
	{
		super.get_marks(java,php,isp,python,cns);
	}

	public void get_externalmarks(int java,int php,int isp,int python,int cns)
	{

		this.java = java;
		this.cns=cns;
		this.php =php;
		this.isp = isp;
		this.python = python;
	}

	public void get_practicalmarks(int javap,int phpp,int pythonp)
	{
		this.javap=javap;
		this.phpp = phpp;
		this.pythonp=pythonp;
	}

	public void get_termworkmarks(int tjava,int tphp,int tcns,int tisp,int tpython)
	{
		this.tjava = tjava;
		this.tcns = tcns;
		this.tphp = tphp;
		this.tisp = tisp;
		this.tpython = tpython;
	}

	public int get_termworktot()
	{
		int ttot;
		ttot = tjava+ tcns+tphp+tisp+tpython;
		return ttot;
	}

	public int get_ptotal()
	{
		int ptotal = javap + phpp + pythonp;
		return ptotal;
	}


	public int get_externaltot()
	{
		int extot;
		extot =java+php+isp+python+cns;
		return extot;
	}
}


public class Marksheet
{
	public static void main(String args[])
	{
		int sess;
		int twtot;
		int externaltotal;
		int prtot;
		Scanner sc = new Scanner(System.in);
		int ch;
		do{
		System.out.println("1. Sessional Marks");
		System.out.println("2. External Marks");
		System.out.println("3. Practical Marks");
		System.out.println("4. TermWork Marks");
		System.out.println("5. Generate Result");
		System.out.println("6. Exit");

		System.out.println("Enter Choice ");
		ch = sc.nextInt();

		Result r = new Result();
		switch(ch)
		{
			case 1 :
					//Sessional marks
					int sjava;
					int scns;
					int sphp;
					int sisp;
					int spython;


					System.out.println("Enter Sessional Marks : ");
					System.out.println("Enter Java Marks : ");
					sjava = sc.nextInt();
					System.out.println("Enter CNS Marks : ");
					scns = sc.nextInt();
					System.out.println("Enter php Marks : ");
					sphp = sc.nextInt();
					System.out.println("Enter ISP Marks : ");
					sisp = sc.nextInt();
					System.out.println("Enter Python Marks : ");
					spython = sc.nextInt();
					r.get_marks(sjava,sphp,sisp,spython,scns);
			 		sess = r.get_total();
					break;
			case 2:
					//External marks
					int ejava;
					int ecns;
					int ephp;
					int eisp;
					int epython;

					System.out.println("Enter External Marks : ");
					System.out.println("Enter Java Marks : ");
					ejava = sc.nextInt();
					System.out.println("Enter CNS Marks : ");
					ecns = sc.nextInt();
					System.out.println("Enter php Marks : ");
					ephp = sc.nextInt();
					System.out.println("Enter ISP Marks : ");
					eisp = sc.nextInt();
					System.out.println("Enter Python Marks : ");
					epython = sc.nextInt();
					r.get_externalmarks(ejava,ephp,eisp,epython,ecns);
					externaltotal = r.get_externaltot();
					break;
			case 3:
					//Practical marks
					int pjava;
					int pphp;
					int ppython;

					System.out.println("Enter External Marks : ");
					System.out.println("Enter Java Marks : ");
					pjava = sc.nextInt();
					System.out.println("Enter php Marks : ");
					pphp = sc.nextInt();
					System.out.println("Enter Python Marks : ");
					ppython = sc.nextInt();
					r.get_practicalmarks(pjava,pphp,ppython);
					prtot =r.get_ptotal();
					break;


			case 4:
					//termwork marks
					int tjava;
					int tcns;
					int tphp;
					int tisp;
					int tpython;

					System.out.println("Enter External Marks : ");
					System.out.println("Enter Java Marks : ");
					tjava = sc.nextInt();
					System.out.println("Enter CNS Marks : ");
					tcns = sc.nextInt();
					System.out.println("Enter php Marks : ");
					tphp = sc.nextInt();
					System.out.println("Enter ISP Marks : ");
					tisp = sc.nextInt();
					System.out.println("Enter Python Marks : ");
					tpython = sc.nextInt();
					r.get_termworkmarks(tjava,tphp,tcns,tisp,tpython);
					twtot = r.get_termworktot();
					break;
			case 6:
					break;
		}
		}while(ch !=6);
	}
}