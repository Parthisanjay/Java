package numberPrograms;
import java.util.*;
public class  ArmstrongNumber
{
	static int length;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int givennum=s.nextInt();
		int sum=0;
		int rem=0;
		int num=givennum;
		length=length(num);
		while(num!=0)
		{
			rem=num%10;
			sum=sum+pow(rem);
			num=num/10;
		}
		if(sum==givennum)
		{
			System.out.println("The Entered Number is a Armstrong Number");	}
		else
		{
			System.out.println("The Entered Number is Not a Armstrong Number");	}
	}
	public static int length(int num)
		{
			int count=0;
			while(num!=0)
			{
			num=num/10;
			count++;
			}
			return count;
		}		
	public static int pow(int rem)
	{
		int pow=1;
		for(int i=1;i<=length;i++)
		{
			pow=pow*rem;
		}
		return pow;
	}
}
