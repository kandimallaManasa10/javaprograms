class  helloworldstr2
{
	public static void main(String[] args) 
	{
		String str="hello world";
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U'||ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			{
              System.out.println(ch);
			}
		}
		
	}
	}

