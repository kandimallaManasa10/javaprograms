class  firstocc
{
	public static void firstoccurance(String str,char ch)
	{
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch1=str.charAt(i);
			if(ch1==ch)
			{
			 System.out.println(i);
			 break;
			}
		}
		
		
	}
	public static void main(String[] args) 
	{
		firstoccurance("ManasaREDdy",'d');
	}
}
