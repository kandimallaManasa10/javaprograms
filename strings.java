class strings 
{
	public static void main(String[] args) 
	{
		String str="*12hell$#o3 4worl%d4";
		String st="";
        String st1="";
		 String st2="";
		 String st3="";

		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				st=st+ch;
			}
		
		
			
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				st1=st1+ch;
			}
			if (ch>='0'&&ch<='9')
			{
				st2+=ch;
			}
			if (!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'))
			{
               st3+=ch;
			}
		}
		
              System.out.println(st);
			   System.out.println(st1);
			   System.out.println(st2);
			   System.out.println(st3);
			    
		
	}
}
