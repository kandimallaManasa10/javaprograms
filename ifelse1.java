import java.util.Scanner;
class  ifelse1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		if(num>21&&num<35 && num%2==0)
		{
          System.out.println(num*3);
		}
		else
		{
		   System.out.println(num-20);
	    }
	}
}
