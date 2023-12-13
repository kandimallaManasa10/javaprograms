class evennum 
{
	public static int even(int num)
	{
		int i=1;
		while (i<num)
		{
			if(num%i==0&&i%2==0)
			{
				System.out.println(i);
			}
			i++;

	}
	return i;
	}
		
	public static void main(String[] args) 
	{
		even(16);
	
	}
}
