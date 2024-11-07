package numberPrograms;
import java.util.Scanner;
public class Factorial {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value");
		int m=s.nextInt();
		int f=1;
		for(int i=1;i<=m;i++)
		{
			f=f*i;
		}
		System.out.println("The Factorial of entered number is :"+f);
	}
}
