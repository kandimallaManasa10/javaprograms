class sumprime
{
	public static void main(String[] args) 
	{
		int n=345672;
		int sum=0;
		while(n!=0)
		{
			int last=n%10;
			sum+=last;
			n=n/10;
			int i=1;
			int count=0;
			while(i<=sum)
		    {
				if(sum%i==0)
			    {
				 count++;
			    }
			i++;
		   }

			if(count==2)
			{

		      System.out.println("prime");
			}
			n=n/10;
	}
     }
}
