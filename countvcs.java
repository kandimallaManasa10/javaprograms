class countvcs 
{
	public static void countvc(String str)
	{
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vcount++;
			}
			else if ( !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}
	public static void main(String[] args) 
	{
		countvc("Manasa@123");
	}
}
