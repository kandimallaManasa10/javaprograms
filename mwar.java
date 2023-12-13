class mwar 
{
	public static String m1()
	{
		System.out.println("this is m1");
		return "bye";
	}
    public String m2()
	{
		System.out.println("this is m2");
		return "hhai";
	}
	public static void main(String[] args) 
	{
		m1();
		mwar mw1=new mwar();
		mw1.m2();
	}
}
