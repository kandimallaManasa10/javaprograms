class christmastree
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3 ;i++ )
		{
			for(int j=1;j<=5;j++)
			{
			if(i+j>=5+1)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				if(i>j)
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
		for (int i=1;i<=4 ;i++ )
		{
			for(int j=1;j<=5;j++)
			{
			if(i+j>=5+1)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			for(int j=1;j<=4;j++)
			{
				if(i>j)
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
		for (int i=1;i<=5 ;i++ )
		{
			for(int j=1;j<=5;j++)
			{
			if(i+j>=5+1)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			for(int j=1;j<=5;j++)
			{
				if(i>j)
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
		for (int i=1;i<=7;i++ )
		{
		for(int j=1;j<=9;j++)
			{
			if((j==4||j==6)&&(i<=4)||(i==5||i==7)&&(j>1&&j<9)||(i==6)&&(j==2||(j==8)))
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
