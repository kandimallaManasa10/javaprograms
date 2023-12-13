class countuclc 
{
	public static void countul(String str)
	{
		int ucount=0;
		int lcount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>=65&&ch<=90)
			{
				ucount++;
			}
			else if (ch>=97&&ch<=122)
			{
				lcount++;
			}
		}
			System.out.println("upper"+ucount);
			System.out.println("lower"+lcount);
		
	}
	public static void main(String[] args) 
	{
		countul("ManasaReddy");
	}
}
