class perfectdig 
{
	public static void main(String[] args) 
	{
		int n=13646;
		while(n!=0)
		{
			int last=n%10;
			int i=1;
			int sum=0;
			while(i<=last/2)
			{
				if(last%i==0)
				{
					sum+=i;
				}
				i++;
			}
			if(sum==last)
			{
				 System.out.println(last);
			}
			n=n/10;
		}
	}
}
