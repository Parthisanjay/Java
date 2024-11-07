package numberPrograms;
import java.util.Scanner;
public class StrongNumRange {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Starting Range");
		int start=s.nextInt();
		System.out.println("Enter the Ending Range");
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
		int sum=0;
		int rem=0;
		int num=i;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
		}
		if(i==sum)
		{
			System.out.print(i+" ");
		}
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
