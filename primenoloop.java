class primenoloop 
{
	public static boolean isprime(int num)
	{
		int i=0;int count=0;
	if (i<=num)
	{
		if (num%i==0)
		{
			count++;
			i++;
		}
	}
	if (count>2)
	{
		return false;
	}
	else {
		return true;
	}
	}
	public static void main(String[] args) 
	{
		
		System.out.println(isprime(3));
	}
}
