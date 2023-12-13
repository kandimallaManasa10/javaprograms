class seriesm
{
	public static void m1(int num)
	{
		int n=11234;int sum=0;
		while(n!=0)
		{	
		  int last=n%10;
		  sum+=last;
		  n=n/10;
		}
		
		
		 System.out.println(sum);
		}
		
	
	
	public static void main(String[] args) 
	{
	   
	   m1(1);
	   
	
	}
}
