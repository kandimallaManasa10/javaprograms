class arthmaticarrys 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,34,5};
		int [] b={3,7,8,95};
		int [] c=new int[a.length];
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<b.length ;j++ )
			{
				c=a[i]+b[j];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
