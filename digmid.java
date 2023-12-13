class digmid
{
	public static void main(String[] args) 
	{
         int n=12345;
		 int n1=n;
		 int count=0;
		 while(n!=0)
		{
	
             count++;
			 n=n/10;
		}
		int middig=count/2;
		while(middig!=0)
		{
			
			middig--;
		    n1=n1/10;
		
		}
		  int last=n1%10;
		System.out.println(last);
		
	}

}
