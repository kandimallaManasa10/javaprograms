class stringvowelspec
{
	public static void main(String[] args) 
	{
		String st1="abc";
		String st2="xyzw";
		String res=" ";
		for (int i=0;i<st1.length() ;i++ )
		{
			
            char ch=st1.charAt(i);
			char ch1=st2.charAt(i);
			res+=ch+""+ch1;
		}
		res+=st2.charAt(3);
		System.out.println(res);
	}
}
