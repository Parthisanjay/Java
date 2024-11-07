package numberPrograms;
import java.util.Scanner;
public class StrongNumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int givennum=s.nextInt();
		int num=givennum;
		int sum=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
		}
		if(givennum==sum)
		{
			System.out.println("The Entered Number is a Strong Number");
		}
		else
		{
			System.out.println("The Entered Number is Not a Strong Number");
		}
	}
	public static int fact(int rem)
	{
		int factorial=1;
		for(int i=1;i<=rem;i++)
		{
			factorial=factorial*i;
		}
			return factorial;
	}
}
