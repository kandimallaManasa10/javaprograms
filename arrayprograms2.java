//36. Do right shift by one for elements of given array

class  arrayprograms2
{
	public static void main(String[] args) 
	{
		int [] k={67,29,39,2,4,97,56};
		int n=3;
		for (int i=0;i<n ; i++)
		{
			last=k[k.length-1];
			for (int j=k.length-1 ;j>=0;j-- )
			{
				k[j]=k[j-1];
			
			
			k[0]=last;
			}
		}
	
	for (int i=0;i<k.length ;i++ )
	{
	
				System.out.println(k[i]);
			}
			
		}
	}

