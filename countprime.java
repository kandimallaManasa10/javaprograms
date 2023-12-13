class countprime 
{
	public static void main(String[] args) 
	{
		int n=456789;
		int count1=0;
		while(n!=0)
		{
			int last=n%10;
			int i=1;
			int count=0;
			while(i<=last)
			{
				if(last%i==0)
				{
					count++;
				}
				i++;
			}
			 if(count==2)
			{
				 count1++;
			}
			n=n/10;
		}
		System.out.println(count1);
		
	}
}
