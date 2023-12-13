class vehicle
{
	public void move()
    public void stop()
	public void reverse()
	public void Break()
}
class bus extends vehicle
{
    public void move()
	{
	System.out.println("move");
	}
    public void stop()
	{
		System.out.println("stop");
	}
	public void reverse();
	{
		System.out.println("reverse");
	}
	public void Break()
	{
		System.out.println("Break");
	}
 
}
class truck extends vehicle
{
    public void move()
	{
	System.out.println("move");
	}
    public void stop()
	{
		System.out.println("stop");
	}
	public void reverse()
	{
		System.out.println("reverse");
	}
	public void Break()
	{
		System.out.println("Break");
	}
 
}
class bike extends vehicle
{
    public void move()
	{
	System.out.println("move");
	}
    public void stop()
	{
		System.out.println("stop");
	}
	public void reverse()
	{
		System.out.println("reverse");
	}
	public void Break()
	{
		System.out.println("Break");
	}
 
}
class mainclass1 
{
	public static void main(String[] args) 
	{
		bike b1=new bike();
		vehicle b=b1;
        truck t1=new truck();
		vehicle t=t1;
		bus b2=new bus();
		vehicle b3=b2;

		
	}
}
