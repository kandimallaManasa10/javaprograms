import java.util.Scanner;
class primeoornot 

{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter a number");
         int n=scan.nextInt();
		if(n!=2&&n!=3&&n!=5&&n!=7)
		{
			if (n%2==0||n%3==0||n%5==0||n%7==0)
			{
					System.out.println(" notprime");

			}
			else
			{
		System.out.println("prime");
		}
		}
		else {
System.out.println("prime");
}
	}
}
