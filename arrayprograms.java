//28. Find out an index of a specified element from a given array.
class  arrayprograms
{
	 
	
	public static void main(String[] args) 
	{
      int [] a={1207,90,343,67,13,74};
	  int element=13;
	  int index=0;
	  for (int i=0;i<a.length ;i++ )
	  {
		  if (a[i]==element)
		  {
			  index=i;
			  break;
		  }
	  }
	  System.out.println("index of" +element+ "is" +index);
	}
}