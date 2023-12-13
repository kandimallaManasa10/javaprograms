class mawr1 
{
	public static void m1()
	{
		System.out.println("this is m1");
	}
    public  void m2()
	{
		System.out.println("this is m2");
	}
	public static void main(String[] args) 
	{
		m1();
		mawr1 mw1=new mawr1();
		mw1.m2();
	}
}