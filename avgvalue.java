class halfmin 
{
	public static void main(String[] args) 
	{
		int [] a={200,60,40,78};
		int min=a[0];
         for(int i=0;i<a.length/2;i++)
		{
			 if (a[i]<min)
			 {
				 min=a[i];
			 }
		}
		System.out.println(min);
	}
}
