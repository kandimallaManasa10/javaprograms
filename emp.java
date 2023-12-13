class employee {
 private int idnum;
 private String empname;
 private double empsal;
	public employee(int idnum,String empname, double empsal) {
		this.idnum=idnum;
		this.empname=empname;
		this.empsal=empsal;
	}

	public void set idnum(int idnum)
	{
		this.idnum=idnum;
	}
	public int get idnum()
	{
		 return idnum;	
			}
	
	public void set empname(String empname)
	{
		this.empname=empname;
	}
	public int get empname()
	{
		return empname;
	}

	public void set empsal(double empsal)
	{
		this.empsal=empsal;
	}
	public double get empsal()
	{
		 return empsal;	
	}
	@override
		public String toString()
	{
		return idnum+""+empname+""+empsal;
	}
	@override
		public int hashcode()
	{
		return getidnum()+(double)sal();
	}
	@override
		public boolean equals (object obj)
	{
		employee e1=(employee)obj;
		return this.idnum==e1.idnum&&this.empname==e1.empname;
			
		}
		
public class emp{
	public static void main(String[]args)
	{
		employee e1=new employee(4,"manasa",6778878);
		employee e2=new employee(5,"manas",454546);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
		System.out.println(e1.equals(e2));

	}
	}

