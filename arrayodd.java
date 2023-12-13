import.java.util.*;

class arrayodd 
{
	static scanner sc=new scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("enter the sixe");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=0;i<size ;i++ )
		{
			if (i%2==1)
			{
				System.out.println("enter the element");
				a[i]=c.nextInt();
			}
		}
		for (int i:a)
		{
			System.out.println(i+"");
		}
	}
}
