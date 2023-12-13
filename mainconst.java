class  shirt
{
	static String brand="abc";
	int size;
	String colour;
	public shirt(int a,String b)
	{
		size=a;
		colour=b;
	}
	int buttons;
	public shirt(int a,String b,int c)
	{
		this(size,colour);
         buttons=c;
	}
	class mainconst
	{
	

	public static void main(String[] args) 
	{
		mainconst s1=new mainconst(34,"blue",6);
		System.out.println(s1.size);
		System.out.println(s1.colour);
		System.out.println(s1.buttons);
	}
	}
}
