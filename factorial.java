class factorial 
{ 
	
	public static void factorial(int n)
	{
		int fact=1;
		if(n==0)
		{
			System.out.println(fact);

			return;
		}
		else {

           fact*=n;
			n--;
			System.out.println(fact);
			}
	}
	public static void main(String[] args) 
	{
		
		factorial(6);
	}
}
