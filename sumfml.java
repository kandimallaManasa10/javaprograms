class sumfml 
{
	public static void main(String[] args) 
	{
		int n=45678;
		int sum=0;
		int c=0;
		int n1=n;
		int n2=n;
		int last=n%10;
	
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		
		int mid=c/2;
		while(mid!=0)
		{
			mid--;
			n1=n1/10;
			
		}
		int mid1=n1%10;
	
		while(n2!=0)
		{
			int first=n2%10;
			n2=n2/10;
			if(n2==0)
			{
	        sum+=first;
			}
		}
			System.out.println(sum+mid1+last);
		

	}
}
