class maxoccurance 
{
	
	public static void main(String[] args) 
	{
		String str="aabbbaacccdddddd";
		char maxchar=str.charAt(0);
		int maxcount=0;
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			int c=0;
			for (int j=0;j<str.length() ;j++ )
			{
				char ch1=str.charAt(j);
				if (ch1==ch)
				{
					c++;
				}
			}
			if (c>maxcount)
			{
              maxchar=ch;
			}
		}
		        System.out.println(maxchar);
	         
          
	 }
}
