class first10prime 
{ 
	
	public static boolean prime(int n)
	{
		int c=0;
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
              c++;
			}

		}
		if (c==2)
		{
			return true;
		}
		return false;
		
	}
		
	public static void main(String[] args) 
	{
		int n=1;
		int c=0;
		while (c<10)
		{
			if (prime(n))
			{
				c++;
			}
			n++;
		}
		
	}
}
