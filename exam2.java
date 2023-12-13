class exam2 
{
	public string msg="parent";
	public void parent(String msg)
	{
		System.out.println(msg);
	}
}
	class exam extends exam2
	{
		public String msg="child";
		public void child(String msg)
		{
			System.out.println(msg);
	}

	
	}
	public static void main(String[] args) 
	{

		exam e1=new exam();
		e1.child();
	}
}
