interface I1
{
	public void m1()
	public void m2()
}
	interface I2 extend I1
	{
     public void m3()
	public void m4()
	}
	 class a implements I2
	 {
		 public void m1()
		 {
			 System.out.println(m1);
	 }
	  public void m2()
	  {
		System.out.println(m2);
	 }
	  public void m3()
		 {
			 System.out.println(m3);
	 }
	  public void m4()
		 {
			 System.out.println(m4);
	 }
	 }
	 class Mainclass
	 {
		 public static void main(String[]args)
		 {
			 A a1=new A();
			 a1.m1();
			 a1.m2();
			 a1.m3();
			 a1.m4();
			 a1.m5();
			 a1.m6();
	 }
	 }
