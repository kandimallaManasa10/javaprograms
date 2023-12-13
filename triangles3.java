class triangles3
{
public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
		for (int j=1;j<=9 ;j++ )
		{
			if(i>=j||i==5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
		}
           for (int i=1;i<=4;i++ )
		{
			   for (int j=1;j<=5 ;j++ )
			   {
				   System.out.print("  ");
			   }
		for (int j=1;j<=4 ;j++ )
		{
			if(i<=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
		}
	}



		}
