class armstrong 
{
	public static void main(String[] args) 
	{
		int n=173;
		int count=0;int n1=n;int n2=n;
		int sum=0;
		while (n!=0)
		{
			n=n/10;
			count++;
		}
		while (n1!=0)
		{
			int power=count;int prod=1;
			while (power!=0)
			{
				int last=n1%10;
				prod*=last;
				power--;
			}
			sum+=prod;
			n1=n1/10;
		}
		if (sum==n2)
		{
			System.out.println("armstrong");
		}
		else{
		System.out.println("not a armstrong");
		}
	}
}
