class customer 
{
	String name;
	int age;
	public String getname(String a)
	{
		name=a;
	return name;
	}
     public void setname(String b)
	{
		 name=b;
		 System.out.println(getname(b));
	}
	public int getage(int c)
	{
		age=c;
		return age;
	}
	public void setage(int d)
	{
		age=d;
		System.out.println(getage(d));
	}
	public static void main(String[] args) 
	{
		customer c1=new customer();	
		c1.setname("manasa");
		c1.setage(21);
		customer c2=new customer(0);	
		c2.setname("chintu");
		c2.setage(20);
		customer c3=new customer();	
		c3.setname("maanas");
		c3.setage(21);



	}
}
