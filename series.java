class series 
{
	public static void main(String[]args) 
	{
		 n=1234;
		 int s=0;
		 while (n!=0)
		 {
			 int last=n%10;
			 {
			 s=s+last;
			 }
		 
			 int i=1;
			 int c=0;
			 while(i<=s)
			 {
				 if(s%i==0)
				 {
					 c++;
				 }
				 i++;
			 }
		 
			 if(c==2)
			 {
				 System.out.println("prime");
			 }
			 else
			 {
				  System.out.println("non prime");
			 }

			
			 n=n/10;
		 }
	}
}


