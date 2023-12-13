//24. Read only even indexed elements from an array
class  array programs
{
	public static void main(String[] args) 
	{
		int [] a={23,56,34,12,54};
		for (int i=0;i<a.length;i++ )
		{
			if (i%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
