class ascevenodd 
{
	public static void asc (int num)
	{
		int m;int n;
		for (int i=0;i<=9 ;i++ )

		{
			n=num;
			while (n!=0)
			{
				m=n%10;
				if (m==1)
				{
					System.out.println(m);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
	
       asc(99654);
		
	}
}
