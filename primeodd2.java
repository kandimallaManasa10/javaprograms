class  primeodd2
{
	public static void main(String[] args) 
	{
		int n=15;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			  count++;
			}
		}
			   if (count==2 && n%2==1)
			  {
                 System.out.println("prime and odd");
			  }
			  else
			  {
		         System.out.println("not a prime but odd");
	          }

	}
}
