class student
{
	String name;
	int age;
	String loc;
	public student(String name,int age,String loc)
	{
		this.name=name;
		this.age=age;
		this.loc=loc;
    }
}
class student1 extends student
{ 
	public student1(String name,int age,String loc)
	{
	super(name,age,loc);
	}
}
class gen 
{
	public static void gmethod(student s1)
	{
		System.out.println("haii");
	}
	public static void main(String[] args) 
	{
		student1 s1=new student1(" manasa",22,"hyd");
		gmethod(new student());
		gmethod(new student1());
	}
}


