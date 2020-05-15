import java.util.*;
class Fibonacci
{
	public static void main(String[] args)
	{
		int num, num1=0,num2=1;
		//Scanner scan=new Scanner(System.in);
		//num= scan.nextInt();
		for(int i=0;i<20;i++)
		{
			num=num1+num2;
			System.out.println(""+num);
			num1=num2;
			num2=num;
		}
			
	}
}