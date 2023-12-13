class charoccur 
{
	public static void charoccurance(String str,char ch){
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch1=str.charAt(i);
			if(ch1==ch)
			{
			 System.out.println(i);
			 
			}
		}
		
		
	}
	public static void main(String[] args)
		{
		charoccurance("abbccecaaacs",'c');
		
	}

}