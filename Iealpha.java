
import java.util.Scanner;
class Iealpha
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{
			System.out.println(ch+0);
		}
		else
		{
			System.out.println(ch);
		}
	}
}
