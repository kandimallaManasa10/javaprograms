class stringhello 
{
	public static void main(String[] args) 
	{
            String st1="123HELLO WORLD456";
			String st2="";
			for (int i=0;i<st1.length() ;i++ )
			{
				char ch=st1.charAt(i);
				if (!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&!(ch>=48&&ch<=57)&&ch!=' ')
				{
                         ch+=32;
				}
				st2+=ch;
			}
		System.out.println(st2);
	}
}
