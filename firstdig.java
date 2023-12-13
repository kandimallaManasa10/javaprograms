class firstdig 
{
	public static void main(String[] args) 
	{ 
		int n=12345;
		
		while(n!=0)
		{
			int last1=n%10;
			
		
		n=n/10;
	
		if(n==0)
		{


		System.out.println(last1);
		}
		}
	}
}
