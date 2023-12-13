class  shirt
{
	static String brand="abc";
	int size;
	String colour;
	shirt(int a,String b)
	{
		size=a;
		colour=b;
	}
	int buttons;
	shirt(int a,String b,int c)
	{
		this(size,colour);
         buttons=c;
	}
	class mainclass
	{
	

	public static void main(String[] args) 
	{
		shirt s1=new shirt(34,"blue",6);
		c1.size();
		c1.colour();
		c1.buttons();
	}
	}
}
