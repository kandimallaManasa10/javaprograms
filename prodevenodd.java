class prodevenodd 
{
	public static void main(String[] args) 
	{
		int n=11111;
		int prod=1;
		while(n!=0)
		{
			int last=n%10;
			prod*=last;
			n/=10;
		}
			if(prod%2==0)
			{

		     System.out.println("even");
			}
			else
			{
              System.out.println("odd");
			}
			
		
					

	}
}
