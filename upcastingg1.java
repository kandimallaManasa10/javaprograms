class employee
{
	 String compname;
	 String loc;
	 String ceo;
	char gender;
	public employee(String compname,String loc,String ceo,char gender)
	{
		this.compname=compname;
        this.loc=loc;
		this.ceo=ceo;
		this.gender=gender;
}
public void display()
	{
	System.out.println(compname);
	System.out.println(loc);
	System.out.println(ceo);
	System.out.println(gender);
	}
}
class employee1 extends employee
{
	String name;
	int age;
	public employee1(String compname,String loc,String ceo,char gender,String name,int age)
{
		super(compname,loc,ceo,gender);
		this.name=name;
         this.age=age;
}
public void display1()
	{
	super.display();
	System.out.println(name);
	System.out.println(age);
	}
}


class upcastingg1 
{
	public static void main(String[] args) 
	{
		employee1 e;
		employee1 e1=new employee1("infosys","hyd","naryanamurthy",'F',"manasa",21);
		employee1 e2=new employee1("google","bglre","murthy",'M',"chintu",19);
		e=e1;//upcasting
		e.display();
		 e=e2;//upcasting
		
		
		e.display();
	}
}
